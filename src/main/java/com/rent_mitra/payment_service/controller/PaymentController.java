package com.rent_mitra.payment_service.controller;

import com.rent_mitra.payment_service.dto.PaymentRequest;
import com.rent_mitra.payment_service.service.PaymentService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/create-order")
    public ResponseEntity<?> createOrder(@RequestBody PaymentRequest paymentRequest) {
        JSONObject response = paymentService.createOrder(
                paymentRequest.getAmount(),
                paymentRequest.getCurrency(),
                paymentRequest.getReceipt()
        );
        return ResponseEntity.ok(response.toString());
    }
}
