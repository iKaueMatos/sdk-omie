package com.omie.sdk.modules.saleandnfe.salesOrders.domain.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class RegistrationInfo implements Serializable {
    @JsonProperty("hFat")
    private String hFat;

    @JsonProperty("denegado")
    private String denied;

    @JsonProperty("uAlt")
    private String uAlt;

    @JsonProperty("hInc")
    private String hInc;

    @JsonProperty("autorizado")
    private String authorized;

    @JsonProperty("devolvido_parcial")
    private String partiallyReturned;

    @JsonProperty("dAlt")
    private String dAlt;

    @JsonProperty("hAlt")
    private String hAlt;

    @JsonProperty("uFat")
    private String uFat;

    @JsonProperty("dInc")
    private String dInc;

    @JsonProperty("devolvido")
    private String returned;

    @JsonProperty("cancelado")
    private String canceled;

    @JsonProperty("faturado")
    private String invoiced;

    @JsonProperty("dFat")
    private String dFat;

    @JsonProperty("cImpAPI")
    private String apiImported;

    @JsonProperty("dCan")
    private String dCan;

    @JsonProperty("hCan")
    private String hCan;

    @JsonProperty("uCan")
    private String uCan;

    public String gethFat() {
        return hFat;
    }

    public void sethFat(String hFat) {
        this.hFat = hFat;
    }

    public String getDenied() {
        return denied;
    }

    public void setDenied(String denied) {
        this.denied = denied;
    }

    public String getuAlt() {
        return uAlt;
    }

    public void setuAlt(String uAlt) {
        this.uAlt = uAlt;
    }

    public String gethInc() {
        return hInc;
    }

    public void sethInc(String hInc) {
        this.hInc = hInc;
    }

    public String getAuthorized() {
        return authorized;
    }

    public void setAuthorized(String authorized) {
        this.authorized = authorized;
    }

    public String getPartiallyReturned() {
        return partiallyReturned;
    }

    public void setPartiallyReturned(String partiallyReturned) {
        this.partiallyReturned = partiallyReturned;
    }

    public String getdAlt() {
        return dAlt;
    }

    public void setdAlt(String dAlt) {
        this.dAlt = dAlt;
    }

    public String gethAlt() {
        return hAlt;
    }

    public void sethAlt(String hAlt) {
        this.hAlt = hAlt;
    }

    public String getuFat() {
        return uFat;
    }

    public void setuFat(String uFat) {
        this.uFat = uFat;
    }

    public String getdInc() {
        return dInc;
    }

    public void setdInc(String dInc) {
        this.dInc = dInc;
    }

    public String getReturned() {
        return returned;
    }

    public void setReturned(String returned) {
        this.returned = returned;
    }

    public String getCanceled() {
        return canceled;
    }

    public void setCanceled(String canceled) {
        this.canceled = canceled;
    }

    public String getInvoiced() {
        return invoiced;
    }

    public void setInvoiced(String invoiced) {
        this.invoiced = invoiced;
    }

    public String getdFat() {
        return dFat;
    }

    public void setdFat(String dFat) {
        this.dFat = dFat;
    }

    public String getApiImported() {
        return apiImported;
    }

    public void setApiImported(String apiImported) {
        this.apiImported = apiImported;
    }

    public String getdCan() {
        return dCan;
    }

    public void setdCan(String dCan) {
        this.dCan = dCan;
    }

    public String gethCan() {
        return hCan;
    }

    public void sethCan(String hCan) {
        this.hCan = hCan;
    }

    public String getuCan() {
        return uCan;
    }

    public void setuCan(String uCan) {
        this.uCan = uCan;
    }
}
