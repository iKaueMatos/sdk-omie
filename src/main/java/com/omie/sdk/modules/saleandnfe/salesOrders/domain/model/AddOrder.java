package com.omie.sdk.modules.saleandnfe.salesOrders.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.util.List;

public class AddOrder {
    @JsonProperty("codigo_pedido_integracao")
    private String integrationOrderCode;

    @JsonProperty("codigo_cliente")
    private String clientCode;

    @JsonProperty("codigo_cliente_integracao")
    private String integrationClientCode;

    @JsonProperty("data_previsao")
    private String expectedDate;

    @JsonProperty("etapa")
    private String stage;

    @JsonProperty("codigo_parcela")
    private String installmentCode;

    @JsonProperty("origem_pedido")
    private String orderSource;

    @JsonProperty("codigo_cenario_impostos")
    private String taxScenarioCode;

    @JsonProperty("codigo_categoria")
    private String categoryCode;

    @JsonProperty("codigo_conta_corrente")
    private String accountCode;

    @JsonProperty("numero_pedido_cliente")
    private String clientOrderNumber;

    @JsonProperty("numero_contrato")
    private String contractNumber;

    @JsonProperty("contato")
    private String contact;

    @JsonProperty("consumidor_final")
    private String finalConsumer;

    @JsonProperty("utilizar_emails")
    private String useEmails;

    @JsonProperty("enviar_email")
    private String sendEmail;

    @JsonProperty("enviar_pix")
    private String sendPix;

    @JsonProperty("codVend")
    private String sellerCode;

    @JsonProperty("codProj")
    private String projectCode;

    @JsonProperty("dados_adicionais_nf")
    private String additionalInvoiceData;

    @JsonProperty("itens")
    private List<OrderItem> items;

    public String getIntegrationOrderCode() {
        return integrationOrderCode;
    }

    public void setIntegrationOrderCode(String integrationOrderCode) {
        this.integrationOrderCode = integrationOrderCode;
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    public String getIntegrationClientCode() {
        return integrationClientCode;
    }

    public void setIntegrationClientCode(String integrationClientCode) {
        this.integrationClientCode = integrationClientCode;
    }

    public String getExpectedDate() {
        return expectedDate;
    }

    public void setExpectedDate(String expectedDate) {
        this.expectedDate = expectedDate;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getInstallmentCode() {
        return installmentCode;
    }

    public void setInstallmentCode(String installmentCode) {
        this.installmentCode = installmentCode;
    }

    public String getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource;
    }

    public String getTaxScenarioCode() {
        return taxScenarioCode;
    }

    public void setTaxScenarioCode(String taxScenarioCode) {
        this.taxScenarioCode = taxScenarioCode;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getClientOrderNumber() {
        return clientOrderNumber;
    }

    public void setClientOrderNumber(String clientOrderNumber) {
        this.clientOrderNumber = clientOrderNumber;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getFinalConsumer() {
        return finalConsumer;
    }

    public void setFinalConsumer(String finalConsumer) {
        this.finalConsumer = finalConsumer;
    }

    public String getUseEmails() {
        return useEmails;
    }

    public void setUseEmails(String useEmails) {
        this.useEmails = useEmails;
    }

    public String getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(String sendEmail) {
        this.sendEmail = sendEmail;
    }

    public String getSendPix() {
        return sendPix;
    }

    public void setSendPix(String sendPix) {
        this.sendPix = sendPix;
    }

    public String getSellerCode() {
        return sellerCode;
    }

    public void setSellerCode(String sellerCode) {
        this.sellerCode = sellerCode;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getAdditionalInvoiceData() {
        return additionalInvoiceData;
    }

    public void setAdditionalInvoiceData(String additionalInvoiceData) {
        this.additionalInvoiceData = additionalInvoiceData;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }
}
