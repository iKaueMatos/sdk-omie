package com.omie.sdk.modules.product.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TaxRecommendation {
    @JsonProperty("cnpj_fabricante")
    private String cnpjManufacturer;

    @JsonProperty("cupom_fiscal")
    private String taxCoupon;

    @JsonProperty("indicador_escala")
    private String scaleIndicator;

    @JsonProperty("origem_mercadoria")
    private String originMerchandise;

    @JsonProperty("market_place")
    private String marketplace;

    @JsonProperty("id_cest")
    private String idCest;

    @JsonProperty("id_preco_tabelado")
    private Integer idPriceTable;

    public String getCnpjManufacturer() {
        return cnpjManufacturer;
    }

    public void setCnpjManufacturer(String cnpjManufacturer) {
        this.cnpjManufacturer = cnpjManufacturer;
    }

    public String getTaxCoupon() {
        return taxCoupon;
    }

    public void setTaxCoupon(String taxCoupon) {
        this.taxCoupon = taxCoupon;
    }

    public String getScaleIndicator() {
        return scaleIndicator;
    }

    public void setScaleIndicator(String scaleIndicator) {
        this.scaleIndicator = scaleIndicator;
    }

    public String getOriginMerchandise() {
        return originMerchandise;
    }

    public void setOriginMerchandise(String originMerchandise) {
        this.originMerchandise = originMerchandise;
    }

    public String getMarketplace() {
        return marketplace;
    }

    public void setMarketplace(String marketplace) {
        this.marketplace = marketplace;
    }

    public String getIdCest() {
        return idCest;
    }

    public void setIdCest(String idCest) {
        this.idCest = idCest;
    }

    public Integer getIdPriceTable() {
        return idPriceTable;
    }

    public void setIdPriceTable(Integer idPriceTable) {
        this.idPriceTable = idPriceTable;
    }
}
