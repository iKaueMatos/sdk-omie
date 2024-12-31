package com.omie.sdk.modules.saleandnfe.invoice.domain.model;

import java.io.Serializable;
import java.lang.Double;
import java.lang.String;
import java.lang.Object;
import java.util.List;

public class ListInvoice implements Serializable {
    private String pagina;
    private String total_de_paginas;
    private String registros;
    private String total_de_registros;
    private List<NfCadastro> nfCadastro;

    public String getPagina() {
        return this.pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

    public String getTotal_de_paginas() {
        return this.total_de_paginas;
    }

    public void setTotal_de_paginas(String total_de_paginas) {
        this.total_de_paginas = total_de_paginas;
    }

    public String getRegistros() {
        return this.registros;
    }

    public void setRegistros(String registros) {
        this.registros = registros;
    }

    public String getTotal_de_registros() {
        return this.total_de_registros;
    }

    public void setTotal_de_registros(String total_de_registros) {
        this.total_de_registros = total_de_registros;
    }

    public List<NfCadastro> getNfCadastro() {
        return this.nfCadastro;
    }

    public void setNfCadastro(List<NfCadastro> nfCadastro) {
        this.nfCadastro = nfCadastro;
    }
}