package com.example.threadlocaldemo.service;

import com.example.threadlocaldemo.config.RequestContext;

public interface OrderService {
    public void placeOrder(String productId, int quantity);
}
