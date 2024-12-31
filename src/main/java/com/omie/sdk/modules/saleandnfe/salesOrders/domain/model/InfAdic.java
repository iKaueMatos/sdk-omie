package com.omie.sdk.modules.saleandnfe.salesOrders.domain.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class InfAdic implements Serializable {
    @JsonProperty("dados_adicionais_item")
    private String additionalItemData;

    @JsonProperty("peso_bruto")
    private String grossWeight;

    @JsonProperty("codigo_local_estoque")
    private String stockLocationCode;

    @JsonProperty("codigo_categoria_item")
    private String itemCategoryCode;

    @JsonProperty("nao_gerar_financeiro")
    private String doNotGenerateFinancial;

    @JsonProperty("item_pedido_compra")
    private Integer purchaseOrderItem;

    @JsonProperty("peso_liquido")
    private Integer netWeight;

    @JsonProperty("nao_movimentar_estoque")
    private String doNotMoveStock;

    @JsonProperty("numero_pedido_compra")
    private String purchaseOrderNumber;

    @JsonProperty("codigo_cenario_impostos_item")
    private String codeScenarioTaxesItem;

    public String getAdditionalItemData() {
        return additionalItemData;
    }

    public void setAdditionalItemData(String additionalItemData) {
        this.additionalItemData = additionalItemData;
    }

    public String getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(String grossWeight) {
        this.grossWeight = grossWeight;
    }

    public String getStockLocationCode() {
        return stockLocationCode;
    }

    public void setStockLocationCode(String stockLocationCode) {
        this.stockLocationCode = stockLocationCode;
    }

    public String getItemCategoryCode() {
        return itemCategoryCode;
    }

    public void setItemCategoryCode(String itemCategoryCode) {
        this.itemCategoryCode = itemCategoryCode;
    }

    public String getDoNotGenerateFinancial() {
        return doNotGenerateFinancial;
    }

    public void setDoNotGenerateFinancial(String doNotGenerateFinancial) {
        this.doNotGenerateFinancial = doNotGenerateFinancial;
    }

    public Integer getPurchaseOrderItem() {
        return purchaseOrderItem;
    }

    public void setPurchaseOrderItem(Integer purchaseOrderItem) {
        this.purchaseOrderItem = purchaseOrderItem;
    }

    public Integer getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(Integer netWeight) {
        this.netWeight = netWeight;
    }

    public String getDoNotMoveStock() {
        return doNotMoveStock;
    }

    public void setDoNotMoveStock(String doNotMoveStock) {
        this.doNotMoveStock = doNotMoveStock;
    }

    public String getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    public void setPurchaseOrderNumber(String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }

    public String getCodeScenarioTaxesItem() {
        return codeScenarioTaxesItem;
    }

    public void setCodeScenarioTaxesItem(String codeScenarioTaxesItem) {
        this.codeScenarioTaxesItem = codeScenarioTaxesItem;
    }
}
