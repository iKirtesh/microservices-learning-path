package com.example.payement;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    
    /**
     * Find a payment by order ID
     * @param orderId the ID of the order
     * @return an Optional containing the payment if found, empty otherwise
     */
    Optional<Payment> findByOrderId(Long orderId);
}
