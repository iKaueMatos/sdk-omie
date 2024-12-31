package com.omie.sdk.modules.saleandnfe.salesOrders.domain.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Icms implements Serializable {
    @JsonProperty("modalidade_icms")
    private String icmsModality;

    @JsonProperty("valor_icms")
    private Integer icmsValue;

    @JsonProperty("aliq_icms")
    private Integer icmsRate;

    @JsonProperty("perc_red_base_icms")
    private Integer icmsBaseReductionPercentage;

    @JsonProperty("base_icms")
    private Integer icmsBaseValue;

    @JsonProperty("cod_sit_trib_icms")
    private String icmsTaxSituationCode;

    @JsonProperty("origem_icms")
    private String icmsOrigin;

    public String getIcmsModality() {
        return icmsModality;
    }

    public void setIcmsModality(String icmsModality) {
        this.icmsModality = icmsModality;
    }

    public Integer getIcmsValue() {
        return icmsValue;
    }

    public void setIcmsValue(Integer icmsValue) {
        this.icmsValue = icmsValue;
    }

    public Integer getIcmsRate() {
        return icmsRate;
    }

    public void setIcmsRate(Integer icmsRate) {
        this.icmsRate = icmsRate;
    }

    public Integer getIcmsBaseReductionPercentage() {
        return icmsBaseReductionPercentage;
    }

    public void setIcmsBaseReductionPercentage(Integer icmsBaseReductionPercentage) {
        this.icmsBaseReductionPercentage = icmsBaseReductionPercentage;
    }

    public Integer getIcmsBaseValue() {
        return icmsBaseValue;
    }

    public void setIcmsBaseValue(Integer icmsBaseValue) {
        this.icmsBaseValue = icmsBaseValue;
    }

    public String getIcmsTaxSituationCode() {
        return icmsTaxSituationCode;
    }

    public void setIcmsTaxSituationCode(String icmsTaxSituationCode) {
        this.icmsTaxSituationCode = icmsTaxSituationCode;
    }

    public String getIcmsOrigin() {
        return icmsOrigin;
    }

    public void setIcmsOrigin(String icmsOrigin) {
        this.icmsOrigin = icmsOrigin;
    }
}