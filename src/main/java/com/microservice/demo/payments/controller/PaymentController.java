package com.microservice.demo.payments.controller;

import com.microservice.demo.payments.service.PaymentService;
import com.microservice.demo.payments.service.dto.PaymentStatus;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    private final PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/status/{orderId}")
    public PaymentStatus getPaymentStatus(@PathVariable String orderId) {
        PaymentStatus paymentStatus = paymentService.getPaymentStatus(orderId);
        paymentStatus.setInstance("payment-service: " + serverPort);
        return paymentStatus;
    }
}