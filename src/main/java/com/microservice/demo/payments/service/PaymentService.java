package com.microservice.demo.payments.service;

import com.microservice.demo.payments.service.dto.PaymentStatus;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    // Mock payment data
    private final Map<String, PaymentStatus> paymentDatabase = new HashMap<>();

    public PaymentService() {
        // Initialize with some mock data
        paymentDatabase.put("ORDER001", new PaymentStatus("ORDER001", "PAID", 150.00, "Credit Card"));
        paymentDatabase.put("ORDER002", new PaymentStatus("ORDER002", "PENDING", 75.50, "Debit Card"));
        paymentDatabase.put("ORDER003", new PaymentStatus("ORDER003", "FAILED", 200.00, "Credit Card"));
        paymentDatabase.put("ORDER004", new PaymentStatus("ORDER004", "PAID", 89.99, "PayPal"));
    }

    public PaymentStatus getPaymentStatus(String orderId) {
        return paymentDatabase.getOrDefault(orderId,
                new PaymentStatus(orderId, "NOT_FOUND", 0.0, "N/A"));
    }
}