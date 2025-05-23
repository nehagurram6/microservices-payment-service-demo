package com.microservice.demo.payments.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class PaymentStatus {
    private String orderId;
    private String status; // PAID, PENDING, FAILED, NOT_FOUND
    private Double amount;
    private String paymentMethod;

}
