package com.omie.sdk.core.Enum;

public enum OrderAction {
    ORDER_SALE("/produtos/pedidovenda/"),
    ORDER("/produtos/pedido/");

    private final String endpoint;

    OrderAction(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getEndpoint() {
        return endpoint;
    }
}
