package com.omie.sdk.modules.saleandnfe.salesOrders.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Irrf implements Serializable {
    @JsonProperty("aliq_irrf")
    private Integer irrfRate;

    @JsonProperty("valor_irrf")
    private Integer irrfValue;

    public Integer getIrrfRate() {
        return irrfRate;
    }

    public void setIrrfRate(Integer irrfRate) {
        this.irrfRate = irrfRate;
    }

    public Integer getIrrfValue() {
        return irrfValue;
    }

    public void setIrrfValue(Integer irrfValue) {
        this.irrfValue = irrfValue;
    }
}
