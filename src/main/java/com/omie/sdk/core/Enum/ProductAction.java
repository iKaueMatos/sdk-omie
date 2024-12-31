package com.omie.sdk.core.Enum;

public enum ProductAction {
    PRODUCT("/geral/produtos/");

    private final String endpoint;

    ProductAction(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getEndpoint() {
        return endpoint;
    }
}
