package com.example.threadlocaldemo.service;

import com.example.threadlocaldemo.config.RequestContext;

public interface UserService {
    void getUserProfile();

    String processData(String userId);
}
