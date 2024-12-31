package com.omie.sdk.modules.saleandnfe.salesOrders.domain.model;

import java.io.Serializable;
import java.lang.Integer;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListOrder implements Serializable {
    @JsonProperty("pagina")
    private Integer page;

    @JsonProperty("total_de_paginas")
    private Integer totalPages;

    @JsonProperty("registros")
    private Integer records;

    @JsonProperty("total_de_registros")
    private Integer totalRecords;

    @JsonProperty("pedido_venda_produto")
    private List<SalesOrderProduct> salesOrderProductList;

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

    public List<SalesOrderProduct> getSalesOrderProductList() {
        return salesOrderProductList;
    }

    public void setSalesOrderProductList(List<SalesOrderProduct> salesOrderProductList) {
        this.salesOrderProductList = salesOrderProductList;
    }
}
