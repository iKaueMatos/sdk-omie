package com.omie.sdk.modules.saleandnfe.salesOrders.domain.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Notes implements Serializable {
    @JsonProperty("obs_venda")
    private String saleObservation;

    public String getSaleObservation() {
        return saleObservation;
    }

    public void setSaleObservation(String saleObservation) {
        this.saleObservation = saleObservation;
    }
}

