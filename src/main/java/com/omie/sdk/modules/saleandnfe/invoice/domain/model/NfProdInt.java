package com.omie.sdk.modules.saleandnfe.invoice.domain.model;

import java.io.Serializable;

public class NfProdInt implements Serializable {
    private String cCodItemInt;

    private String cCodProdInt;

    private String nCodProd;

    private String nCodItem;

    public String getCCodItemInt() {
        return this.cCodItemInt;
    }

    public void setCCodItemInt(String cCodItemInt) {
        this.cCodItemInt = cCodItemInt;
    }

    public String getCCodProdInt() {
        return this.cCodProdInt;
    }

    public void setCCodProdInt(String cCodProdInt) {
        this.cCodProdInt = cCodProdInt;
    }

    public String getNCodProd() {
        return this.nCodProd;
    }

    public void setNCodProd(String nCodProd) {
        this.nCodProd = nCodProd;
    }

    public String getNCodItem() {
        return this.nCodItem;
    }

    public void setNCodItem(String nCodItem) {
        this.nCodItem = nCodItem;
    }
}