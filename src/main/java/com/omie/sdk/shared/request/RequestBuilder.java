package com.omie.sdk.shared.request;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import java.util.HashMap;
import java.util.Map;

public class RequestBuilder {
    public static HttpHeaders buildHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }

    public static Map<String, Object> buildRequestBody(String call, String appKey, String appSecret, Map<String, Object> params) {
        Map<String, Object> body = new HashMap<>();
        body.put("call", call);
        body.put("app_key", appKey);
        body.put("app_secret", appSecret);
        body.put("param", new Object[]{params});
        return body;
    }

    public static Map<String, Object> buildParams(IParamStrategy strategy, Integer page, Integer size, String importedApi, Map<String, Object> params) {
        return strategy.buildParams(page, size, importedApi, params);
    }
}

