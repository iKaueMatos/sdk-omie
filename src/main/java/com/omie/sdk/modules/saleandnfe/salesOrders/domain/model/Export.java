package com.omie.sdk.modules.saleandnfe.salesOrders.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;



public class Export {
    @JsonProperty("nao_exportacao")
    private String exportNo;

    public String getExportNo() {
        return exportNo;
    }

    public void setExportNo(String exportNo) {
        this.exportNo = exportNo;
    }
}
