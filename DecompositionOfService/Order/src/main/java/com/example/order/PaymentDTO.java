package com.example.order;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDTO {
	private Long paymentId;
	private Long orderId;
	private double amount;
	private String status;
	private String transactionId;
}