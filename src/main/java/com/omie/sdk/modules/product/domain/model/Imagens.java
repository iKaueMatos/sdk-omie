package com.omie.sdk.modules.product.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Imagens implements Serializable {
    @JsonProperty("url_imagem")
    private String urlImagem;

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }
}
