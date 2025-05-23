package com.microservice.demo.payments.controller;

import com.microservice.demo.payments.service.PaymentService;
import com.microservice.demo.payments.service.dto.PaymentStatus;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payment")
@AllArgsConstructor
public class PaymentController {

    private PaymentService paymentService;

    @GetMapping("/status/{orderId}")
    public PaymentStatus getPaymentStatus(@PathVariable String orderId) {
        return paymentService.getPaymentStatus(orderId);
    }
}