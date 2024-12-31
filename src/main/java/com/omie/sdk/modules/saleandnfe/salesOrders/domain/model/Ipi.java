package com.omie.sdk.modules.saleandnfe.salesOrders.domain.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Ipi implements Serializable {
    @JsonProperty("cod_sit_trib_ipi")
    private String ipiTaxSituationCode;

    @JsonProperty("aliq_ipi")
    private Integer ipiRate;

    @JsonProperty("enquadramento_ipi")
    private String ipiClassification;

    @JsonProperty("qtde_unid_trib_ipi")
    private Integer ipiTaxableUnitQuantity;

    @JsonProperty("valor_unid_trib_ipi")
    private Integer ipiTaxableUnitValue;

    @JsonProperty("tipo_calculo_ipi")
    private String ipiCalculationType;

    @JsonProperty("base_ipi")
    private Integer ipiBaseValue;

    @JsonProperty("valor_ipi")
    private Integer ipiValue;

    public String getIpiTaxSituationCode() {
        return ipiTaxSituationCode;
    }

    public void setIpiTaxSituationCode(String ipiTaxSituationCode) {
        this.ipiTaxSituationCode = ipiTaxSituationCode;
    }

    public Integer getIpiRate() {
        return ipiRate;
    }

    public void setIpiRate(Integer ipiRate) {
        this.ipiRate = ipiRate;
    }

    public String getIpiClassification() {
        return ipiClassification;
    }

    public void setIpiClassification(String ipiClassification) {
        this.ipiClassification = ipiClassification;
    }

    public Integer getIpiTaxableUnitQuantity() {
        return ipiTaxableUnitQuantity;
    }

    public void setIpiTaxableUnitQuantity(Integer ipiTaxableUnitQuantity) {
        this.ipiTaxableUnitQuantity = ipiTaxableUnitQuantity;
    }

    public Integer getIpiTaxableUnitValue() {
        return ipiTaxableUnitValue;
    }

    public void setIpiTaxableUnitValue(Integer ipiTaxableUnitValue) {
        this.ipiTaxableUnitValue = ipiTaxableUnitValue;
    }

    public String getIpiCalculationType() {
        return ipiCalculationType;
    }

    public void setIpiCalculationType(String ipiCalculationType) {
        this.ipiCalculationType = ipiCalculationType;
    }

    public Integer getIpiBaseValue() {
        return ipiBaseValue;
    }

    public void setIpiBaseValue(Integer ipiBaseValue) {
        this.ipiBaseValue = ipiBaseValue;
    }

    public Integer getIpiValue() {
        return ipiValue;
    }

    public void setIpiValue(Integer ipiValue) {
        this.ipiValue = ipiValue;
    }
}
