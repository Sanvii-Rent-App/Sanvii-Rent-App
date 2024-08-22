package com.rent_mitra.payment_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment-service")
public class PaymentServiceTestController {

    @GetMapping
    public String testPaymentService(){

        return "This is payment service test controller";
    }
}
