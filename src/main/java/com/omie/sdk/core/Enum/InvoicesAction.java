package com.omie.sdk.core.Enum;

public enum InvoicesAction {
    INVOICE("/produtos/nfconsultar/");

    private final String endpoint;

    InvoicesAction(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getEndpoint() {
        return endpoint;
    }
}
