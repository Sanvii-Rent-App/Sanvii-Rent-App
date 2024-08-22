package com.rent_mitra.payment_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment-service")
public class PaymentServiceTestController {

    @GetMapping("/get-name")
    public String testPaymentService(@RequestParam String name){
        return "This is payment service test controller and your name is := "+ name;
    }
}
