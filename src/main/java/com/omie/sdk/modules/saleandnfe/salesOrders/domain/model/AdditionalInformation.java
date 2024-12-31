package com.omie.sdk.modules.saleandnfe.salesOrders.domain.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AdditionalInformation implements Serializable {
    @JsonProperty("codVend")
    private String sellerCode;

    @JsonProperty("outros_detalhes")
    private Object otherDetails;

    @JsonProperty("codigo_categoria")
    private String categoryCode;

    @JsonProperty("consumidor_final")
    private String endConsumer;

    @JsonProperty("codProj")
    private Integer projectCode;

    @JsonProperty("numero_contrato")
    private String contractNumber;

    @JsonProperty("dados_adicionais_nf")
    private String additionalInvoiceData;

    @JsonProperty("enviar_email")
    private String sendEmail;

    @JsonProperty("codigo_conta_corrente")
    private String currentAccountCode;

    @JsonProperty("utilizar_emails")
    private String useEmails;

    @JsonProperty("contato")
    private String contact;

    @JsonProperty("enviar_pix")
    private String sendPix;

    @JsonProperty("numero_pedido_cliente")
    private String clientOrderNumber;

    public String getSellerCode() {
        return sellerCode;
    }

    public void setSellerCode(String sellerCode) {
        this.sellerCode = sellerCode;
    }

    public Object getOtherDetails() {
        return otherDetails;
    }

    public void setOtherDetails(Object otherDetails) {
        this.otherDetails = otherDetails;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getEndConsumer() {
        return endConsumer;
    }

    public void setEndConsumer(String endConsumer) {
        this.endConsumer = endConsumer;
    }

    public Integer getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(Integer projectCode) {
        this.projectCode = projectCode;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getAdditionalInvoiceData() {
        return additionalInvoiceData;
    }

    public void setAdditionalInvoiceData(String additionalInvoiceData) {
        this.additionalInvoiceData = additionalInvoiceData;
    }

    public String getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(String sendEmail) {
        this.sendEmail = sendEmail;
    }

    public String getCurrentAccountCode() {
        return currentAccountCode;
    }

    public void setCurrentAccountCode(String currentAccountCode) {
        this.currentAccountCode = currentAccountCode;
    }

    public String getUseEmails() {
        return useEmails;
    }

    public void setUseEmails(String useEmails) {
        this.useEmails = useEmails;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getSendPix() {
        return sendPix;
    }

    public void setSendPix(String sendPix) {
        this.sendPix = sendPix;
    }

    public String getClientOrderNumber() {
        return clientOrderNumber;
    }

    public void setClientOrderNumber(String clientOrderNumber) {
        this.clientOrderNumber = clientOrderNumber;
    }
}

