package com.example.threadlocaldemo;

import com.example.threadlocaldemo.config.RequestContext;
import com.example.threadlocaldemo.service.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        AuthService authService = new AuthServiceImpl();
        UserService userService = new UserServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        int numberOfThreads = 1000;
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfThreads);

        List<String> results = new ArrayList<>();

        IntStream.range(0, numberOfThreads).forEach(i -> executorService.execute(() -> {

            String authToken = "authToken" + Thread.currentThread().getId();
            String userId = "user" + Thread.currentThread().getId();
            authService.authenticate(authToken, userId);

            userService.getUserProfile();

            String data = userService.processData(userId);

            orderService.placeOrder("product456", 2);

            results.add(data);

            RequestContext.clear();
        }));

        executorService.shutdown();

        results.forEach(System.out::println);
    }
}