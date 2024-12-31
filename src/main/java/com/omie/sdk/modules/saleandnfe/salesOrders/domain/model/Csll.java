package com.omie.sdk.modules.saleandnfe.salesOrders.domain.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Csll implements Serializable {
    @JsonProperty("aliq_csll")
    private Integer csllRate;

    @JsonProperty("valor_csll")
    private Integer csllAmount;

    public Integer getCsllRate() {
        return csllRate;
    }

    public void setCsllRate(Integer csllRate) {
        this.csllRate = csllRate;
    }

    public Integer getCsllAmount() {
        return csllAmount;
    }

    public void setCsllAmount(Integer csllAmount) {
        this.csllAmount = csllAmount;
    }
}
