package com.example.threadlocaldemo.service;

import com.example.threadlocaldemo.config.RequestContext;

public class OrderServiceImpl implements OrderService {

    @Override
    public void placeOrder(String productId, int quantity) {
        RequestContext context = RequestContext.getCurrentContext();
        System.out.println("Placing order for user ID: " + context.getUserId() + ", Product ID: " + productId + ", Quantity: " + quantity);

    }
}
