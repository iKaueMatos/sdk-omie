package com.omie.sdk.modules.saleandnfe.invoice.domain.model;

import java.io.Serializable;
import java.util.List;

public class NfCadastro implements Serializable {
    private List<Det> det;

    private Total total;

    private List<Titulos> titulos;

    private Object pedido;

    private Compl compl;

    private Ide ide;

    private NfDestInt nfDestInt;

    private Info info;

    private NfEmitInt nfEmitInt;

    public List<Det> getDet() {
        return this.det;
    }

    public void setDet(List<Det> det) {
        this.det = det;
    }

    public Total getTotal() {
        return this.total;
    }

    public void setTotal(Total total) {
        this.total = total;
    }

    public List<Titulos> getTitulos() {
        return this.titulos;
    }

    public void setTitulos(List<Titulos> titulos) {
        this.titulos = titulos;
    }

    public Object getPedido() {
        return this.pedido;
    }

    public void setPedido(Object pedido) {
        this.pedido = pedido;
    }

    public Compl getCompl() {
        return this.compl;
    }

    public void setCompl(Compl compl) {
        this.compl = compl;
    }

    public Ide getIde() {
        return this.ide;
    }

    public void setIde(Ide ide) {
        this.ide = ide;
    }

    public NfDestInt getNfDestInt() {
        return this.nfDestInt;
    }

    public void setNfDestInt(NfDestInt nfDestInt) {
        this.nfDestInt = nfDestInt;
    }

    public Info getInfo() {
        return this.info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public NfEmitInt getNfEmitInt() {
        return this.nfEmitInt;
    }

    public void setNfEmitInt(NfEmitInt nfEmitInt) {
        this.nfEmitInt = nfEmitInt;
    }
}
