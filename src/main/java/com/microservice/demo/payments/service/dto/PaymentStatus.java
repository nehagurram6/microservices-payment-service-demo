package com.microservice.demo.payments.service.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class PaymentStatus {
    private String orderId;
    private String status; // PAID, PENDING, FAILED, NOT_FOUND
    private Double amount;
    private String paymentMethod;
    @Setter
    @Getter
    private String instance;

    public PaymentStatus(String orderId, String status, Double amount, String paymentMethod) {
        this.orderId = orderId;
        this.status = status;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

}
