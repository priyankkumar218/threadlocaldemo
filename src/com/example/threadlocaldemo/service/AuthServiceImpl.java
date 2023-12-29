package com.example.threadlocaldemo.service;

import com.example.threadlocaldemo.config.RequestContext;

public class AuthServiceImpl implements AuthService {
    @Override
    public void authenticate(String authToken, String userId) {
        try {
            RequestContext context = new RequestContext();
            context.setAuthToken(authToken);
            context.setUserId(userId);
            RequestContext.setCurrentContext(context);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
