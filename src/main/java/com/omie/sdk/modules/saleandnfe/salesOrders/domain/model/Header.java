package com.omie.sdk.modules.saleandnfe.salesOrders.domain.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Header implements Serializable {
    @JsonProperty("codigo_cenario_impostos")
    private String taxScenarioCode;

    @JsonProperty("qtde_parcelas")
    private Integer installmentQuantity;

    @JsonProperty("enc_hora")
    private String closingTime;

    @JsonProperty("etapa")
    private String stage;

    @JsonProperty("codigo_empresa")
    private String companyCode;

    @JsonProperty("bloqueado")
    private String blocked;

    @JsonProperty("numero_pedido")
    private String orderNumber;

    @JsonProperty("origem_pedido")
    private String orderOrigin;

    @JsonProperty("data_previsao")
    private String estimatedDate;

    @JsonProperty("enc_motivo")
    private String closingReason;

    @JsonProperty("codigo_cliente")
    private String clientCode;

    @JsonProperty("importado_api")
    private String importedByApi;

    @JsonProperty("enc_data")
    private String closingDate;

    @JsonProperty("codigo_pedido")
    private String orderCode;

    @JsonProperty("quantidade_itens")
    private Integer itemQuantity;

    @JsonProperty("codigo_pedido_integracao")
    private String integrationOrderCode;

    @JsonProperty("enc_user")
    private String closingUser;

    @JsonProperty("codigo_parcela")
    private String installmentCode;

    @JsonProperty("encerrado")
    private String closed;

    public String getTaxScenarioCode() {
        return taxScenarioCode;
    }

    public void setTaxScenarioCode(String taxScenarioCode) {
        this.taxScenarioCode = taxScenarioCode;
    }

    public Integer getInstallmentQuantity() {
        return installmentQuantity;
    }

    public void setInstallmentQuantity(Integer installmentQuantity) {
        this.installmentQuantity = installmentQuantity;
    }

    public String getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(String closingTime) {
        this.closingTime = closingTime;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getBlocked() {
        return blocked;
    }

    public void setBlocked(String blocked) {
        this.blocked = blocked;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderOrigin() {
        return orderOrigin;
    }

    public void setOrderOrigin(String orderOrigin) {
        this.orderOrigin = orderOrigin;
    }

    public String getEstimatedDate() {
        return estimatedDate;
    }

    public void setEstimatedDate(String estimatedDate) {
        this.estimatedDate = estimatedDate;
    }

    public String getClosingReason() {
        return closingReason;
    }

    public void setClosingReason(String closingReason) {
        this.closingReason = closingReason;
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    public String getImportedByApi() {
        return importedByApi;
    }

    public void setImportedByApi(String importedByApi) {
        this.importedByApi = importedByApi;
    }

    public String getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(String closingDate) {
        this.closingDate = closingDate;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public Integer getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(Integer itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public String getIntegrationOrderCode() {
        return integrationOrderCode;
    }

    public void setIntegrationOrderCode(String integrationOrderCode) {
        this.integrationOrderCode = integrationOrderCode;
    }

    public String getClosingUser() {
        return closingUser;
    }

    public void setClosingUser(String closingUser) {
        this.closingUser = closingUser;
    }

    public String getInstallmentCode() {
        return installmentCode;
    }

    public void setInstallmentCode(String installmentCode) {
        this.installmentCode = installmentCode;
    }

    public String getClosed() {
        return closed;
    }

    public void setClosed(String closed) {
        this.closed = closed;
    }
}

