package com.rent_mitra.payment_service.service;

import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService{
    @Autowired
    private RazorpayClient razorpayClient;

    @Override
    public JSONObject createOrder(String amount, String currency, String receipt) {
        try {
            JSONObject orderRequest = new JSONObject();
            orderRequest.put("amount", Integer.parseInt(amount) * 100); // Convert amount to paise
            orderRequest.put("currency", currency);
            orderRequest.put("receipt", receipt);

            Order order = razorpayClient.orders.create(orderRequest);
            return order.toJson();
        } catch (Exception e) {
            throw new RuntimeException("Error creating Razorpay order", e);
        }
    }
}
