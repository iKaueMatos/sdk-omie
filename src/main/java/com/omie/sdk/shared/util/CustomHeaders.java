package com.omie.sdk.shared.util;

import org.springframework.http.HttpHeaders;

public class CustomHeaders {
    public static HttpHeaders getDefaultHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "CustomHeaderValue");
        headers.add("Another-Header", "AnotherHeaderValue");
        return headers;
    }

    public static HttpHeaders getSecurityHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Bearer token");
        headers.add("X-Content-Type-Options", "nosniff");
        return headers;
    }

    public static HttpHeaders getCorsHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Access-Control-Allow-Origin", "*");
        headers.add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        return headers;
    }
}
