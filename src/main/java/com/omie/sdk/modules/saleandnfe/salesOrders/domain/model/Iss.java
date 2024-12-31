package com.omie.sdk.modules.saleandnfe.salesOrders.domain.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Iss implements Serializable {
    @JsonProperty("base_iss")
    private int issBaseValue;

    @JsonProperty("valor_iss")
    private int issValue;

    @JsonProperty("aliq_iss")
    private int issRate;

    @JsonProperty("retem_iss")
    private String issWithholding;

    public int getIssBaseValue() {
        return issBaseValue;
    }

    public void setIssBaseValue(int issBaseValue) {
        this.issBaseValue = issBaseValue;
    }

    public int getIssValue() {
        return issValue;
    }

    public void setIssValue(int issValue) {
        this.issValue = issValue;
    }

    public int getIssRate() {
        return issRate;
    }

    public void setIssRate(int issRate) {
        this.issRate = issRate;
    }

    public String getIssWithholding() {
        return issWithholding;
    }

    public void setIssWithholding(String issWithholding) {
        this.issWithholding = issWithholding;
    }
}

