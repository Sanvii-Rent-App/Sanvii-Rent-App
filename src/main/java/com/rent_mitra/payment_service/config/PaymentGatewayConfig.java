package com.rent_mitra.payment_service.config;

import com.razorpay.RazorpayClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaymentGatewayConfig {
    @Bean
    public RazorpayClient razorpayClient() throws Exception {
        String apiKey = "your_api_key";
        String secretKey = "your_secret_key";
        return new RazorpayClient(apiKey, secretKey);
    }
}
