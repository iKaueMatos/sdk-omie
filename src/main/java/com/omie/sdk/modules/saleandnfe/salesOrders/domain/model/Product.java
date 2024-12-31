package com.omie.sdk.modules.saleandnfe.salesOrders.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.io.Serializable;

public class Product implements Serializable {
    @JsonProperty("motivo_icms_desonerado")
    private String icmsExemptionReason;

    @JsonProperty("tipo_desconto")
    private String discountType;

    @JsonProperty("codigo")
    private String code;

    @JsonProperty("valor_desconto")
    private Integer discountValue;

    @JsonProperty("cnpj_fabricante")
    private String manufacturerCnpj;

    @JsonProperty("indicador_escala")
    private String scaleIndicator;

    @JsonProperty("percentual_desconto")
    private Integer discountPercentage;

    @JsonProperty("cfop")
    private String cfop;

    @JsonProperty("unidade")
    private String unit;

    @JsonProperty("valor_icms_desonerado")
    private Integer icmsExemptionValue;

    @JsonProperty("valor_mercadoria")
    private Integer merchandiseValue;

    @JsonProperty("codigo_produto")
    private String productCode;

    @JsonProperty("descricao")
    private String description;

    @JsonProperty("reservado")
    private String reserved;

    @JsonProperty("valor_total")
    private Integer totalValue;

    @JsonProperty("ean")
    private String ean;

    @JsonProperty("valor_deducao")
    private Integer deductionValue;

    @JsonProperty("ncm")
    private String ncm;

    @JsonProperty("codigo_tabela_preco")
    private Integer priceTableCode;

    @JsonProperty("quantidade")
    private Integer quantity;

    @JsonProperty("valor_unitario")
    private Integer unitValue;

    public String getIcmsExemptionReason() {
        return icmsExemptionReason;
    }

    public void setIcmsExemptionReason(String icmsExemptionReason) {
        this.icmsExemptionReason = icmsExemptionReason;
    }

    public String getDiscountType() {
        return discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(Integer discountValue) {
        this.discountValue = discountValue;
    }

    public String getManufacturerCnpj() {
        return manufacturerCnpj;
    }

    public void setManufacturerCnpj(String manufacturerCnpj) {
        this.manufacturerCnpj = manufacturerCnpj;
    }

    public String getScaleIndicator() {
        return scaleIndicator;
    }

    public void setScaleIndicator(String scaleIndicator) {
        this.scaleIndicator = scaleIndicator;
    }

    public Integer getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(Integer discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public String getCfop() {
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getIcmsExemptionValue() {
        return icmsExemptionValue;
    }

    public void setIcmsExemptionValue(Integer icmsExemptionValue) {
        this.icmsExemptionValue = icmsExemptionValue;
    }

    public Integer getMerchandiseValue() {
        return merchandiseValue;
    }

    public void setMerchandiseValue(Integer merchandiseValue) {
        this.merchandiseValue = merchandiseValue;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReserved() {
        return reserved;
    }

    public void setReserved(String reserved) {
        this.reserved = reserved;
    }

    public Integer getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Integer totalValue) {
        this.totalValue = totalValue;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public Integer getDeductionValue() {
        return deductionValue;
    }

    public void setDeductionValue(Integer deductionValue) {
        this.deductionValue = deductionValue;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public Integer getPriceTableCode() {
        return priceTableCode;
    }

    public void setPriceTableCode(Integer priceTableCode) {
        this.priceTableCode = priceTableCode;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getUnitValue() {
        return unitValue;
    }

    public void setUnitValue(Integer unitValue) {
        this.unitValue = unitValue;
    }
}
