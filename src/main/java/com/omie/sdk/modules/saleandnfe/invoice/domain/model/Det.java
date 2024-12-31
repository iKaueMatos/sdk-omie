package com.omie.sdk.modules.saleandnfe.invoice.domain.model;

import java.io.Serializable;

public class Det implements Serializable {
    private Prod prod;

    private NfProdInt nfProdInt;

    private Object rastreabilidade;

    public Prod getProd() {
        return this.prod;
    }

    public void setProd(Prod prod) {
        this.prod = prod;
    }

    public NfProdInt getNfProdInt() {
        return this.nfProdInt;
    }

    public void setNfProdInt(NfProdInt nfProdInt) {
        this.nfProdInt = nfProdInt;
    }

    public Object getRastreabilidade() {
        return this.rastreabilidade;
    }

    public void setRastreabilidade(Object rastreabilidade) {
        this.rastreabilidade = rastreabilidade;
    }
}
