package com.example.payement;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentRepository paymentRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Payment processPayment(@Valid @RequestBody Payment payment) {
        // Validate payment amount
        if (payment.getAmount() <= 0) {
            throw new IllegalArgumentException("Payment amount must be greater than zero");
        }

        // Set payment details
        payment.setStatus("PENDING");
        payment.setTransactionId(generateTransactionId());

        // Process payment (in a real app, this would call a payment gateway)
        try {
            // Simulate payment processing
            Thread.sleep(500);
            payment.setStatus("SUCCESS");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            payment.setStatus("FAILED");
        }

        return paymentRepository.save(payment);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Payment> getPaymentById(@PathVariable Long id) {
        return paymentRepository.findById(id)
                .map(payment -> new ResponseEntity<>(payment, HttpStatus.OK))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/order/{orderId}")
    public ResponseEntity<Payment> getPaymentByOrderId(@PathVariable Long orderId) {
        return paymentRepository.findByOrderId(orderId)
                .map(payment -> new ResponseEntity<>(payment, HttpStatus.OK))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public Page<Payment> getAllPayments(Pageable pageable) {
        return paymentRepository.findAll(pageable);
    }

    private String generateTransactionId() {
        return "TXN" + UUID.randomUUID().toString().replace("-", "").substring(0, 10).toUpperCase();
    }

    // Exception handler for validation errors
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(IllegalArgumentException.class)
    public String handleValidationExceptions(IllegalArgumentException ex) {
        return ex.getMessage();
    }
}
