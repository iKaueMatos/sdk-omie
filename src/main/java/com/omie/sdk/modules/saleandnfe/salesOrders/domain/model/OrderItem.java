package com.omie.sdk.modules.saleandnfe.salesOrders.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class OrderItem {
    @JsonProperty("codigo_pedido")
    private String orderCode;

    @JsonProperty("codigo_produto")
    private String productCode;

    @JsonProperty("quantidade")
    private int quantity;

    @JsonProperty("cfop")
    private String cfop;

    @JsonProperty("valor_unitario")
    private double unitPrice;

    @JsonProperty("tipo_desconto")
    private String discountType;

    @JsonProperty("percentual_desconto")
    private double discountPercentage;

    @JsonProperty("valor_desconto")
    private double discountValue;

    @JsonProperty("codigo_tabela_preco")
    private String priceTableCode;

    @JsonProperty("codigo_local_estoque")
    private String stockLocationCode;

    @JsonProperty("codigo_cenario_impostos_item")
    private String taxScenarioCode;

    @JsonProperty("numero_pedido_compra")
    private String purchaseOrderNumber;

    @JsonProperty("item_pedido_compra")
    private String purchaseOrderItem;

    @JsonProperty("quantidade_trib")
    private int taxableQuantity;

    @JsonProperty("unidade_trib")
    private String taxableUnit;

    @JsonProperty("dados_adicionais_item")
    private String additionalItemData;

    @JsonProperty("nao_movimentar_estoque")
    private boolean doNotMoveStock;

    @JsonProperty("nao_gerar_financeiro")
    private boolean doNotGenerateFinancial;

    @JsonProperty("nao_somar_total")
    private boolean doNotSumTotal;

    @JsonProperty("codigo_categoria_item")
    private String itemCategoryCode;

    @JsonProperty("obs_item")
    private String itemObservation;

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCfop() {
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDiscountType() {
        return discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(double discountValue) {
        this.discountValue = discountValue;
    }

    public String getPriceTableCode() {
        return priceTableCode;
    }

    public void setPriceTableCode(String priceTableCode) {
        this.priceTableCode = priceTableCode;
    }

    public String getStockLocationCode() {
        return stockLocationCode;
    }

    public void setStockLocationCode(String stockLocationCode) {
        this.stockLocationCode = stockLocationCode;
    }

    public String getTaxScenarioCode() {
        return taxScenarioCode;
    }

    public void setTaxScenarioCode(String taxScenarioCode) {
        this.taxScenarioCode = taxScenarioCode;
    }

    public String getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    public void setPurchaseOrderNumber(String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }

    public String getPurchaseOrderItem() {
        return purchaseOrderItem;
    }

    public void setPurchaseOrderItem(String purchaseOrderItem) {
        this.purchaseOrderItem = purchaseOrderItem;
    }

    public int getTaxableQuantity() {
        return taxableQuantity;
    }

    public void setTaxableQuantity(int taxableQuantity) {
        this.taxableQuantity = taxableQuantity;
    }

    public String getTaxableUnit() {
        return taxableUnit;
    }

    public void setTaxableUnit(String taxableUnit) {
        this.taxableUnit = taxableUnit;
    }

    public String getAdditionalItemData() {
        return additionalItemData;
    }

    public void setAdditionalItemData(String additionalItemData) {
        this.additionalItemData = additionalItemData;
    }

    public boolean isDoNotMoveStock() {
        return doNotMoveStock;
    }

    public void setDoNotMoveStock(boolean doNotMoveStock) {
        this.doNotMoveStock = doNotMoveStock;
    }

    public boolean isDoNotGenerateFinancial() {
        return doNotGenerateFinancial;
    }

    public void setDoNotGenerateFinancial(boolean doNotGenerateFinancial) {
        this.doNotGenerateFinancial = doNotGenerateFinancial;
    }

    public boolean isDoNotSumTotal() {
        return doNotSumTotal;
    }

    public void setDoNotSumTotal(boolean doNotSumTotal) {
        this.doNotSumTotal = doNotSumTotal;
    }

    public String getItemCategoryCode() {
        return itemCategoryCode;
    }

    public void setItemCategoryCode(String itemCategoryCode) {
        this.itemCategoryCode = itemCategoryCode;
    }

    public String getItemObservation() {
        return itemObservation;
    }

    public void setItemObservation(String itemObservation) {
        this.itemObservation = itemObservation;
    }
}
