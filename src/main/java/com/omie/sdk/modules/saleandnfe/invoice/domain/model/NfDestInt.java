package com.omie.sdk.modules.saleandnfe.invoice.domain.model;

import java.io.Serializable;

public class NfDestInt implements Serializable {
    private String cRazao;

    private String nCodCli;

    private String cCodCliInt;

    private String cnpj_cpf;

    public String getCRazao() {
        return this.cRazao;
    }

    public void setCRazao(String cRazao) {
        this.cRazao = cRazao;
    }

    public String getNCodCli() {
        return this.nCodCli;
    }

    public void setNCodCli(String nCodCli) {
        this.nCodCli = nCodCli;
    }

    public String getCCodCliInt() {
        return this.cCodCliInt;
    }

    public void setCCodCliInt(String cCodCliInt) {
        this.cCodCliInt = cCodCliInt;
    }

    public String getCnpj_cpf() {
        return this.cnpj_cpf;
    }

    public void setCnpj_cpf(String cnpj_cpf) {
        this.cnpj_cpf = cnpj_cpf;
    }
}
