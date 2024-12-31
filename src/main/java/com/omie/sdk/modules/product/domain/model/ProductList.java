package com.omie.sdk.modules.product.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.omie.sdk.modules.product.application.service.ProductListService;

import java.io.Serializable;
import java.lang.Integer;
import java.util.List;

public class ProductList implements Serializable {
    @JsonProperty("pagina")
    private Integer page;

    @JsonProperty("total_de_paginas")
    private Integer totalPages;

    @JsonProperty("registros")
    private Integer records;

    @JsonProperty("total_de_registros")
    private Integer totalRecords;

    @JsonProperty("produto_servico_cadastro")
    private List<ProductListService> productListService;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getRecords() {
        return records;
    }

    public void setRecords(Integer records) {
        this.records = records;
    }

    public Integer getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
    }

    public List<ProductListService> getProductListService() {
        return productListService;
    }

    public void setProductListService(List<ProductListService> productListService) {
        this.productListService = productListService;
    }
}
