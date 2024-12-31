package com.omie.sdk.modules.saleandnfe.invoice.domain.model;

import java.io.Serializable;

public class NfEmitInt implements Serializable {
    private String nCodEmp;

    private String cCodEmpInt;

    public String getNCodEmp() {
        return this.nCodEmp;
    }

    public void setNCodEmp(String nCodEmp) {
        this.nCodEmp = nCodEmp;
    }

    public String getCCodEmpInt() {
        return this.cCodEmpInt;
    }

    public void setCCodEmpInt(String cCodEmpInt) {
        this.cCodEmpInt = cCodEmpInt;
    }
}
