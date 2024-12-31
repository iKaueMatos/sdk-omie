package com.omie.sdk.modules.saleandnfe.salesOrders.domain.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;


public class SocialSecurity implements Serializable {
    @JsonProperty("aliq_inss")
    private Integer inssRate;

    @JsonProperty("valor_inss")
    private Integer inssValue;

    public Integer getInssRate() {
        return inssRate;
    }

    public void setInssRate(Integer inssRate) {
        this.inssRate = inssRate;
    }

    public Integer getInssValue() {
        return inssValue;
    }

    public void setInssValue(Integer inssValue) {
        this.inssValue = inssValue;
    }
}

