package com.example.threadlocaldemo.service;

import com.example.threadlocaldemo.config.RequestContext;

public interface AuthService {
    public void authenticate(String authToken, String userId);
}
