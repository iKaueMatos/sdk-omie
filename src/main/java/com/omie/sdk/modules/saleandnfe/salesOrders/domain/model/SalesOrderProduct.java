package com.omie.sdk.modules.saleandnfe.salesOrders.domain.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SalesOrderProduct implements Serializable {
    @JsonProperty("cabecalho")
    private Header header;

    @JsonProperty("observacoes")
    private Notes notes;

    @JsonProperty("det")
    private List<Detail> detailList;

    @JsonProperty("informacoes_adicionais")
    private AdditionalInformation additionalInformation;

    @JsonProperty("lista_parcelas")
    private InstallmentList installmentList;

    @JsonProperty("frete")
    private Freight freight;

    @JsonProperty("total_pedido")
    private OrderTotal orderTotal;

    @JsonProperty("infoCadastro")
    private RegistrationInfo registrationInfo;

    @JsonProperty("departamentos")
    private List<Departments> departments;

    @JsonProperty("exportacao")
    private Export export;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }

    public List<Detail> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<Detail> detailList) {
        this.detailList = detailList;
    }

    public AdditionalInformation getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(AdditionalInformation additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public InstallmentList getInstallmentList() {
        return installmentList;
    }

    public void setInstallmentList(InstallmentList installmentList) {
        this.installmentList = installmentList;
    }

    public Freight getFreight() {
        return freight;
    }

    public void setFreight(Freight freight) {
        this.freight = freight;
    }

    public OrderTotal getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(OrderTotal orderTotal) {
        this.orderTotal = orderTotal;
    }

    public RegistrationInfo getRegistrationInfo() {
        return registrationInfo;
    }

    public void setRegistrationInfo(RegistrationInfo registrationInfo) {
        this.registrationInfo = registrationInfo;
    }

    public List<Departments> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Departments> departments) {
        this.departments = departments;
    }

    public Export getExport() {
        return export;
    }

    public void setExport(Export export) {
        this.export = export;
    }
}
