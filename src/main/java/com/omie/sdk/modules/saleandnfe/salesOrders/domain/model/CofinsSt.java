package com.omie.sdk.modules.saleandnfe.salesOrders.domain.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CofinsSt implements Serializable {
    @JsonProperty("tipo_calculo_cofins_st")
    private String calculationTypeCofinsSt;

    @JsonProperty("cod_sit_trib_cofins_st")
    private String taxSituationCodeCofinsSt;

    @JsonProperty("qtde_unid_trib_cofins_st")
    private int quantityUnitTaxCofinsSt;

    @JsonProperty("base_cofins_st")
    private int baseCofinsSt;

    @JsonProperty("aliq_cofins_st")
    private int rateCofinsSt;

    @JsonProperty("margem_cofins_st")
    private int marginCofinsSt;

    @JsonProperty("valor_cofins_st")
    private int valueCofinsSt;

    @JsonProperty("valor_unid_trib_cofins_st")
    private int unitTaxValueCofinsSt;

    public String getCalculationTypeCofinsSt() {
        return calculationTypeCofinsSt;
    }

    public void setCalculationTypeCofinsSt(String calculationTypeCofinsSt) {
        this.calculationTypeCofinsSt = calculationTypeCofinsSt;
    }

    public String getTaxSituationCodeCofinsSt() {
        return taxSituationCodeCofinsSt;
    }

    public void setTaxSituationCodeCofinsSt(String taxSituationCodeCofinsSt) {
        this.taxSituationCodeCofinsSt = taxSituationCodeCofinsSt;
    }

    public int getQuantityUnitTaxCofinsSt() {
        return quantityUnitTaxCofinsSt;
    }

    public void setQuantityUnitTaxCofinsSt(int quantityUnitTaxCofinsSt) {
        this.quantityUnitTaxCofinsSt = quantityUnitTaxCofinsSt;
    }

    public int getBaseCofinsSt() {
        return baseCofinsSt;
    }

    public void setBaseCofinsSt(int baseCofinsSt) {
        this.baseCofinsSt = baseCofinsSt;
    }

    public int getRateCofinsSt() {
        return rateCofinsSt;
    }

    public void setRateCofinsSt(int rateCofinsSt) {
        this.rateCofinsSt = rateCofinsSt;
    }

    public int getMarginCofinsSt() {
        return marginCofinsSt;
    }

    public void setMarginCofinsSt(int marginCofinsSt) {
        this.marginCofinsSt = marginCofinsSt;
    }

    public int getValueCofinsSt() {
        return valueCofinsSt;
    }

    public void setValueCofinsSt(int valueCofinsSt) {
        this.valueCofinsSt = valueCofinsSt;
    }

    public int getUnitTaxValueCofinsSt() {
        return unitTaxValueCofinsSt;
    }

    public void setUnitTaxValueCofinsSt(int unitTaxValueCofinsSt) {
        this.unitTaxValueCofinsSt = unitTaxValueCofinsSt;
    }
}

