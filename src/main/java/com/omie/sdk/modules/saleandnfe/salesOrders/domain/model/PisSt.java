package com.omie.sdk.modules.saleandnfe.salesOrders.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PisSt implements Serializable {
    @JsonProperty("valor_pis_st")
    private Integer pisStValue;

    @JsonProperty("base_pis_st")
    private Integer pisStBase;

    @JsonProperty("qtde_unid_trib_pis_st")
    private Integer quantityUnitTribPisSt;

    @JsonProperty("valor_unid_trib_pis_st")
    private Integer valueUnitTribPisSt;

    @JsonProperty("aliq_pis_st")
    private Integer pisStRate;

    @JsonProperty("cod_sit_trib_pis_st")
    private String pisStTaxSituationCode;

    @JsonProperty("margem_pis_st")
    private Integer pisStMargin;

    @JsonProperty("tipo_calculo_pis_st")
    private String pisStCalculationType;

    @JsonProperty("aliq_pis")
    private String aliqpis;

    @JsonProperty("base_pis")
    private String basePis;

    @JsonProperty("cod_sit_trib_pis")
    private String pisTaxSituationCode;

    @JsonProperty("qtde_unid_trib_pis")
    private String quantityUnitTaxPis;

    public Integer getPisStValue() {
        return pisStValue;
    }

    public void setPisStValue(Integer pisStValue) {
        this.pisStValue = pisStValue;
    }

    public Integer getPisStBase() {
        return pisStBase;
    }

    public void setPisStBase(Integer pisStBase) {
        this.pisStBase = pisStBase;
    }

    public Integer getQuantityUnitTribPisSt() {
        return quantityUnitTribPisSt;
    }

    public void setQuantityUnitTribPisSt(Integer quantityUnitTribPisSt) {
        this.quantityUnitTribPisSt = quantityUnitTribPisSt;
    }

    public Integer getValueUnitTribPisSt() {
        return valueUnitTribPisSt;
    }

    public void setValueUnitTribPisSt(Integer valueUnitTribPisSt) {
        this.valueUnitTribPisSt = valueUnitTribPisSt;
    }

    public Integer getPisStRate() {
        return pisStRate;
    }

    public void setPisStRate(Integer pisStRate) {
        this.pisStRate = pisStRate;
    }

    public String getPisStTaxSituationCode() {
        return pisStTaxSituationCode;
    }

    public void setPisStTaxSituationCode(String pisStTaxSituationCode) {
        this.pisStTaxSituationCode = pisStTaxSituationCode;
    }

    public Integer getPisStMargin() {
        return pisStMargin;
    }

    public void setPisStMargin(Integer pisStMargin) {
        this.pisStMargin = pisStMargin;
    }

    public String getPisStCalculationType() {
        return pisStCalculationType;
    }

    public void setPisStCalculationType(String pisStCalculationType) {
        this.pisStCalculationType = pisStCalculationType;
    }

    public String getAliqpis() {
        return aliqpis;
    }

    public void setAliqpis(String aliqpis) {
        this.aliqpis = aliqpis;
    }

    public String getBasePis() {
        return basePis;
    }

    public void setBasePis(String basePis) {
        this.basePis = basePis;
    }

    public String getPisTaxSituationCode() {
        return pisTaxSituationCode;
    }

    public void setPisTaxSituationCode(String pisTaxSituationCode) {
        this.pisTaxSituationCode = pisTaxSituationCode;
    }

    public String getQuantityUnitTaxPis() {
        return quantityUnitTaxPis;
    }

    public void setQuantityUnitTaxPis(String quantityUnitTaxPis) {
        this.quantityUnitTaxPis = quantityUnitTaxPis;
    }
}

