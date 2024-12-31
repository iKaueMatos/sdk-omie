package com.omie.sdk.modules.saleandnfe.salesOrders.domain.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;



public class IcmsSt implements Serializable {
    @JsonProperty("aliq_icms_opprop")
    private Integer icmsOwnOperationRate;

    @JsonProperty("valor_icms_st")
    private Integer icmsStValue;

    @JsonProperty("perc_red_base_icms_op")
    private Integer icmsOperationBaseReductionPercent;

    @JsonProperty("perc_red_base_icms_st")
    private Integer icmsStBaseReductionPercent;

    @JsonProperty("aliq_icms_st")
    private Integer icmsStRate;

    @JsonProperty("margem_icms_st")
    private Integer icmsStMargin;

    @JsonProperty("base_icms_st")
    private Integer icmsStBase;

    @JsonProperty("cod_sit_trib_icms_st")
    private String icmsStTaxSituationCode;

    @JsonProperty("modalidade_icms_st")
    private String icmsStMode;

    @JsonProperty("cest")
    private String cest;

    public Integer getIcmsOwnOperationRate() {
        return icmsOwnOperationRate;
    }

    public void setIcmsOwnOperationRate(Integer icmsOwnOperationRate) {
        this.icmsOwnOperationRate = icmsOwnOperationRate;
    }

    public Integer getIcmsStValue() {
        return icmsStValue;
    }

    public void setIcmsStValue(Integer icmsStValue) {
        this.icmsStValue = icmsStValue;
    }

    public Integer getIcmsOperationBaseReductionPercent() {
        return icmsOperationBaseReductionPercent;
    }

    public void setIcmsOperationBaseReductionPercent(Integer icmsOperationBaseReductionPercent) {
        this.icmsOperationBaseReductionPercent = icmsOperationBaseReductionPercent;
    }

    public Integer getIcmsStBaseReductionPercent() {
        return icmsStBaseReductionPercent;
    }

    public void setIcmsStBaseReductionPercent(Integer icmsStBaseReductionPercent) {
        this.icmsStBaseReductionPercent = icmsStBaseReductionPercent;
    }

    public Integer getIcmsStRate() {
        return icmsStRate;
    }

    public void setIcmsStRate(Integer icmsStRate) {
        this.icmsStRate = icmsStRate;
    }

    public Integer getIcmsStMargin() {
        return icmsStMargin;
    }

    public void setIcmsStMargin(Integer icmsStMargin) {
        this.icmsStMargin = icmsStMargin;
    }

    public Integer getIcmsStBase() {
        return icmsStBase;
    }

    public void setIcmsStBase(Integer icmsStBase) {
        this.icmsStBase = icmsStBase;
    }

    public String getIcmsStTaxSituationCode() {
        return icmsStTaxSituationCode;
    }

    public void setIcmsStTaxSituationCode(String icmsStTaxSituationCode) {
        this.icmsStTaxSituationCode = icmsStTaxSituationCode;
    }

    public String getIcmsStMode() {
        return icmsStMode;
    }

    public void setIcmsStMode(String icmsStMode) {
        this.icmsStMode = icmsStMode;
    }

    public String getCest() {
        return cest;
    }

    public void setCest(String cest) {
        this.cest = cest;
    }
}

