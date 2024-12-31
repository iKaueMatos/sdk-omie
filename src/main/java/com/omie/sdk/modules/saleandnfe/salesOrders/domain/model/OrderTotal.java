package com.omie.sdk.modules.saleandnfe.salesOrders.domain.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderTotal implements Serializable {
    @JsonProperty("base_calculo_icms")
    private Integer icmsCalculationBase;

    @JsonProperty("valor_deducoes")
    private Integer deductionValue;

    @JsonProperty("valor_pis")
    private Double pisValue;

    @JsonProperty("valor_csll")
    private Integer csllValue;

    @JsonProperty("valor_ir")
    private Integer incomeTaxValue;

    @JsonProperty("base_calculo_st")
    private Integer stCalculationBase;

    @JsonProperty("valor_cofins")
    private Double cofinsValue;

    @JsonProperty("valor_inss")
    private Integer inssValue;

    @JsonProperty("valor_total_pedido")
    private Integer totalOrderValue;

    @JsonProperty("valor_icms")
    private Integer icmsValue;

    @JsonProperty("valor_iss")
    private Integer issValue;

    @JsonProperty("valor_IPI")
    private Integer ipiValue;

    @JsonProperty("valor_descontos")
    private Integer discountValue;

    @JsonProperty("valor_mercadorias")
    private Integer merchandiseValue;

    @JsonProperty("valor_st")
    private Integer stValue;

    public Integer getIcmsCalculationBase() {
        return icmsCalculationBase;
    }

    public void setIcmsCalculationBase(Integer icmsCalculationBase) {
        this.icmsCalculationBase = icmsCalculationBase;
    }

    public Integer getDeductionValue() {
        return deductionValue;
    }

    public void setDeductionValue(Integer deductionValue) {
        this.deductionValue = deductionValue;
    }

    public Double getPisValue() {
        return pisValue;
    }

    public void setPisValue(Double pisValue) {
        this.pisValue = pisValue;
    }

    public Integer getCsllValue() {
        return csllValue;
    }

    public void setCsllValue(Integer csllValue) {
        this.csllValue = csllValue;
    }

    public Integer getIncomeTaxValue() {
        return incomeTaxValue;
    }

    public void setIncomeTaxValue(Integer incomeTaxValue) {
        this.incomeTaxValue = incomeTaxValue;
    }

    public Integer getStCalculationBase() {
        return stCalculationBase;
    }

    public void setStCalculationBase(Integer stCalculationBase) {
        this.stCalculationBase = stCalculationBase;
    }

    public Double getCofinsValue() {
        return cofinsValue;
    }

    public void setCofinsValue(Double cofinsValue) {
        this.cofinsValue = cofinsValue;
    }

    public Integer getInssValue() {
        return inssValue;
    }

    public void setInssValue(Integer inssValue) {
        this.inssValue = inssValue;
    }

    public Integer getTotalOrderValue() {
        return totalOrderValue;
    }

    public void setTotalOrderValue(Integer totalOrderValue) {
        this.totalOrderValue = totalOrderValue;
    }

    public Integer getIcmsValue() {
        return icmsValue;
    }

    public void setIcmsValue(Integer icmsValue) {
        this.icmsValue = icmsValue;
    }

    public Integer getIssValue() {
        return issValue;
    }

    public void setIssValue(Integer issValue) {
        this.issValue = issValue;
    }

    public Integer getIpiValue() {
        return ipiValue;
    }

    public void setIpiValue(Integer ipiValue) {
        this.ipiValue = ipiValue;
    }

    public Integer getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(Integer discountValue) {
        this.discountValue = discountValue;
    }

    public Integer getMerchandiseValue() {
        return merchandiseValue;
    }

    public void setMerchandiseValue(Integer merchandiseValue) {
        this.merchandiseValue = merchandiseValue;
    }

    public Integer getStValue() {
        return stValue;
    }

    public void setStValue(Integer stValue) {
        this.stValue = stValue;
    }
}

