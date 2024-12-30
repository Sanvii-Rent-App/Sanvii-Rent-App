package com.rent_mitra.payment_service.service;

import org.json.JSONObject;

public interface PaymentService {
        JSONObject createOrder(String amount, String currency, String receipt);
}
