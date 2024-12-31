package com.omie.sdk.modules.saleandnfe.salesOrders.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.io.Serializable;
import java.util.List;

public class InstallmentList implements Serializable {
    @JsonProperty("parcela")
    private List<Installment> installment;

    public List<Installment> getInstallment() {
        return installment;
    }

    public void setInstallment(List<Installment> installment) {
        this.installment = installment;
    }
}
