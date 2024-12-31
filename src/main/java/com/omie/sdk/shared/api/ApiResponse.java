package com.omie.sdk.shared.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiResponse<T> {
    @JsonProperty("status")
    private String status;

    @JsonProperty("data")
    private T data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

