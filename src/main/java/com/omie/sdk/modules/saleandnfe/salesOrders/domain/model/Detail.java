package com.omie.sdk.modules.saleandnfe.salesOrders.domain.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Detail implements Serializable {
    @JsonProperty("observacao")
    private Object observation;

    @JsonProperty("combustivel")
    private Object fuel;

    @JsonProperty("inf_adic")
    private InfAdic additionalInfo;

    @JsonProperty("produto")
    private Product product;

    @JsonProperty("tributavel")
    private Object taxable;

    @JsonProperty("imposto")
    private Tax tax;

    @JsonProperty("ide")
    private Ide ide;

    @JsonProperty("rastreabilidade")
    private Object traceability;

    public Object getObservation() {
        return observation;
    }

    public void setObservation(Object observation) {
        this.observation = observation;
    }

    public Object getFuel() {
        return fuel;
    }

    public void setFuel(Object fuel) {
        this.fuel = fuel;
    }

    public InfAdic getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(InfAdic additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Object getTaxable() {
        return taxable;
    }

    public void setTaxable(Object taxable) {
        this.taxable = taxable;
    }

    public Tax getTax() {
        return tax;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

    public Ide getIde() {
        return ide;
    }

    public void setIde(Ide ide) {
        this.ide = ide;
    }

    public Object getTraceability() {
        return traceability;
    }

    public void setTraceability(Object traceability) {
        this.traceability = traceability;
    }
}
