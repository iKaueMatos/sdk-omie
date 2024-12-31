package com.omie.sdk.modules.saleandnfe.invoice.domain.model;

import java.io.Serializable;

public class Compl implements Serializable {
    private String nIdPedido;
    private String nIdNF;
    private String cModFrete;
    private String cChaveNFe;
    private String nIdTransp;
    private String cCodCateg;
    private String nIdReceb;

    public String getNIdPedido() {
        return this.nIdPedido;
    }

    public void setNIdPedido(String nIdPedido) {
        this.nIdPedido = nIdPedido;
    }

    public String getNIdNF() {
        return this.nIdNF;
    }

    public void setNIdNF(String nIdNF) {
        this.nIdNF = nIdNF;
    }

    public String getCModFrete() {
        return this.cModFrete;
    }

    public void setCModFrete(String cModFrete) {
        this.cModFrete = cModFrete;
    }

    public String getCChaveNFe() {
        return this.cChaveNFe;
    }

    public void setCChaveNFe(String cChaveNFe) {
        this.cChaveNFe = cChaveNFe;
    }

    public String getNIdTransp() {
        return this.nIdTransp;
    }

    public void setNIdTransp(String nIdTransp) {
        this.nIdTransp = nIdTransp;
    }

    public String getCCodCateg() {
        return this.cCodCateg;
    }

    public void setCCodCateg(String cCodCateg) {
        this.cCodCateg = cCodCateg;
    }

    public String getNIdReceb() {
        return this.nIdReceb;
    }

    public void setNIdReceb(String nIdReceb) {
        this.nIdReceb = nIdReceb;
    }
}