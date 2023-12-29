package com.example.threadlocaldemo.service;

import com.example.threadlocaldemo.config.RequestContext;

public class UserServiceImpl implements UserService {
    @Override
    public void getUserProfile() {
        RequestContext context = RequestContext.getCurrentContext();
        System.out.println("Fetching user profile for user ID: " + context.getUserId());
    }

    @Override
    public String processData(String userId) {
        return "Processed data for user ID: " + userId;
    }
}
