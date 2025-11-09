package com.example.order;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionResponse {
    private Order order;
    private double amount;
	private String status;
	private String transactionId;
	private LocalDateTime timestamp;
	private String message;

    public static TransactionResponse success(Order order, double amount, String transactionId) {
        return TransactionResponse.builder()
                .order(order)
                .amount(amount)
                .status("SUCCESS")
                .transactionId(transactionId)
                .timestamp(LocalDateTime.now())
                .message("Payment processed successfully")
                .build();
    }

    public static TransactionResponse failed(Order order, double amount, String message) {
        return TransactionResponse.builder()
                .order(order)
                .amount(amount)
                .status("FAILED")
                .timestamp(LocalDateTime.now())
                .message(message)
                .build();
    }
}
