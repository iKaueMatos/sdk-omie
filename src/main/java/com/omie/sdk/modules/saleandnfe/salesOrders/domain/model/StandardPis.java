package com.omie.sdk.modules.saleandnfe.salesOrders.domain.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StandardPis implements Serializable {
    @JsonProperty("valor_unid_trib_pis")
    private Integer unitPisTaxValue;

    @JsonProperty("tipo_calculo_pis")
    private String pisCalculationType;

    @JsonProperty("valor_pis")
    private Integer pisValue;

    @JsonProperty("base_pis")
    private Integer pisBase;

    @JsonProperty("cod_sit_trib_pis")
    private String pisTaxSituationCode;

    @JsonProperty("aliq_pis")
    private Integer pisRate;

    @JsonProperty("qtde_unid_trib_pis")
    private Integer pisTaxUnitQuantity;

    public Integer getUnitPisTaxValue() {
        return unitPisTaxValue;
    }

    public void setUnitPisTaxValue(Integer unitPisTaxValue) {
        this.unitPisTaxValue = unitPisTaxValue;
    }

    public String getPisCalculationType() {
        return pisCalculationType;
    }

    public void setPisCalculationType(String pisCalculationType) {
        this.pisCalculationType = pisCalculationType;
    }

    public Integer getPisValue() {
        return pisValue;
    }

    public void setPisValue(Integer pisValue) {
        this.pisValue = pisValue;
    }

    public Integer getPisBase() {
        return pisBase;
    }

    public void setPisBase(Integer pisBase) {
        this.pisBase = pisBase;
    }

    public String getPisTaxSituationCode() {
        return pisTaxSituationCode;
    }

    public void setPisTaxSituationCode(String pisTaxSituationCode) {
        this.pisTaxSituationCode = pisTaxSituationCode;
    }

    public Integer getPisRate() {
        return pisRate;
    }

    public void setPisRate(Integer pisRate) {
        this.pisRate = pisRate;
    }

    public Integer getPisTaxUnitQuantity() {
        return pisTaxUnitQuantity;
    }

    public void setPisTaxUnitQuantity(Integer pisTaxUnitQuantity) {
        this.pisTaxUnitQuantity = pisTaxUnitQuantity;
    }
}

