package com.omie.sdk.modules.saleandnfe.salesOrders.domain.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Ide implements Serializable {
    @JsonProperty("codigo_item_integracao")
    private String integrationItemCode;

    @JsonProperty("codigo_item")
    private String itemCode;

    @JsonProperty("simples_nacional")
    private String simpleNational;

    public String getIntegrationItemCode() {
        return integrationItemCode;
    }

    public void setIntegrationItemCode(String integrationItemCode) {
        this.integrationItemCode = integrationItemCode;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getSimpleNational() {
        return simpleNational;
    }

    public void setSimpleNational(String simpleNational) {
        this.simpleNational = simpleNational;
    }
}

