package com.omie.sdk.modules.saleandnfe.salesOrders.domain.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;


public class CofinsDefault implements Serializable {
    @JsonProperty("base_cofins")
    private Integer cofinsBase;

    @JsonProperty("aliq_cofins")
    private Double cofinsRate;

    @JsonProperty("qtde_unid_trib_cofins")
    private Integer cofinsUnitTaxQuantity;

    @JsonProperty("valor_unid_trib_cofins")
    private Integer cofinsUnitTaxValue;

    @JsonProperty("tipo_calculo_cofins")
    private String cofinsCalculationType;

    @JsonProperty("valor_cofins")
    private Double cofinsValue;

    @JsonProperty("cod_sit_trib_cofins")
    private String cofinsTaxSituationCode;

    public Integer getCofinsBase() {
        return cofinsBase;
    }

    public void setCofinsBase(Integer cofinsBase) {
        this.cofinsBase = cofinsBase;
    }

    public Double getCofinsRate() {
        return cofinsRate;
    }

    public void setCofinsRate(Double cofinsRate) {
        this.cofinsRate = cofinsRate;
    }

    public Integer getCofinsUnitTaxQuantity() {
        return cofinsUnitTaxQuantity;
    }

    public void setCofinsUnitTaxQuantity(Integer cofinsUnitTaxQuantity) {
        this.cofinsUnitTaxQuantity = cofinsUnitTaxQuantity;
    }

    public Integer getCofinsUnitTaxValue() {
        return cofinsUnitTaxValue;
    }

    public void setCofinsUnitTaxValue(Integer cofinsUnitTaxValue) {
        this.cofinsUnitTaxValue = cofinsUnitTaxValue;
    }

    public String getCofinsCalculationType() {
        return cofinsCalculationType;
    }

    public void setCofinsCalculationType(String cofinsCalculationType) {
        this.cofinsCalculationType = cofinsCalculationType;
    }

    public Double getCofinsValue() {
        return cofinsValue;
    }

    public void setCofinsValue(Double cofinsValue) {
        this.cofinsValue = cofinsValue;
    }

    public String getCofinsTaxSituationCode() {
        return cofinsTaxSituationCode;
    }

    public void setCofinsTaxSituationCode(String cofinsTaxSituationCode) {
        this.cofinsTaxSituationCode = cofinsTaxSituationCode;
    }
}

