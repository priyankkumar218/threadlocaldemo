package com.example.threadlocaldemo.config;

public class RequestContext {
    private static final ThreadLocal<RequestContext> threadLocalContext = new ThreadLocal<>();

    private String authToken;
    private String userId;

    public static RequestContext getCurrentContext() {
        return threadLocalContext.get();
    }

    public static void setCurrentContext(RequestContext context) {
        threadLocalContext.set(context);
    }

    public static void clear() {
        threadLocalContext.remove();
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
