package com.example.order;

import com.example.order.exception.ResourceNotFoundException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class OrderService {

	private final OrderRepository orderRepository;
	private final RestTemplate restTemplate;
	private final ObjectMapper objectMapper;

	@Value("${payment.service.url:http://localhost:8082}")
	private String paymentServiceUrl;


	public TransactionResponse placeOrder(Order order) {
		validateOrder(order);

		// Save order with initial status
		order.setOrderStatus(OrderStatus.PENDING.name());
		Order savedOrder = orderRepository.save(order);

		try {
			// Process payment
			PaymentDTO paymentResponse = processPayment(savedOrder);

			// Update order status based on payment response
			updateOrderStatus(savedOrder, paymentResponse);

			return TransactionResponse.success(
					savedOrder,
					savedOrder.getPrice(),
					paymentResponse.getTransactionId()
			);

		} catch (HttpClientErrorException e) {
			log.error("Payment processing failed: {}", e.getResponseBodyAsString(), e);
			updateOrderStatus(savedOrder, "PAYMENT_FAILED");
			return TransactionResponse.failed(
					savedOrder,
					savedOrder.getPrice(),
					"Payment processing failed: " + extractErrorMessage(e)
			);

		} catch (RestClientException e) {
			log.error("Error communicating with payment service: {}", e.getMessage(), e);
			updateOrderStatus(savedOrder, "PAYMENT_PENDING");
			return TransactionResponse.failed(
					savedOrder,
					savedOrder.getPrice(),
					"Temporary error processing payment. Please try again later."
			);
		}
	}

	private void validateOrder(Order order) {
		if (order == null) {
			throw new IllegalArgumentException("Order cannot be null");
		}
		if (order.getPrice() <= 0) {
			throw new IllegalArgumentException("Order price must be greater than zero");
		}
		// Add more validations as needed
	}

	private PaymentDTO processPayment(Order order) {
		PaymentRequest paymentRequest = PaymentRequest.builder()
				.orderId(order.getId())
				.amount(order.getPrice())
				.build();

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<PaymentRequest> requestEntity = new HttpEntity<>(paymentRequest, headers);

		ResponseEntity<PaymentDTO> response = restTemplate.exchange(
				paymentServiceUrl + "/payments",
				HttpMethod.POST,
				requestEntity,
				PaymentDTO.class
		);

		return response.getBody();
	}

	private void updateOrderStatus(Order order, PaymentDTO paymentResponse) {
		if (paymentResponse != null && "SUCCESS".equals(paymentResponse.getStatus())) {
			order.setOrderStatus(OrderStatus.PAID.name());
		} else {
			order.setOrderStatus(OrderStatus.PAYMENT_FAILED.name());
		}
		orderRepository.save(order);
	}

	private void updateOrderStatus(Order order, String status) {
		order.setOrderStatus(status);
		orderRepository.save(order);
	}

	private String extractErrorMessage(HttpClientErrorException e) {
		try {
			// Try to parse the error response from the payment service
			String responseBody = e.getResponseBodyAsString();
			if (responseBody != null) {
				ErrorResponse errorResponse = objectMapper.readValue(responseBody, ErrorResponse.class);
				return errorResponse.getMessage() != null ?
						errorResponse.getMessage() :
						"Payment processing failed";
			}
			return "Payment processing failed: " + e.getStatusText();
		} catch (Exception ex) {
			log.error("Error parsing error response from payment service", ex);
			return "Error processing payment: " + e.getMessage();
		}
	}

	public List<Order> getAllOrders() {
		return orderRepository.findAll();
	}

	public Order getOrderById(Long id) {
		return orderRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Order not found with id: " + id));
	}
}