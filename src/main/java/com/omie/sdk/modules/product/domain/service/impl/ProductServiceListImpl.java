package com.omie.sdk.modules.product.domain.service.impl;

import com.google.gson.Gson;
import com.omie.sdk.core.Enum.OrderAction;
import com.omie.sdk.core.Enum.ProductAction;
import com.omie.sdk.core.Infra.client.OmieClient;
import com.omie.sdk.modules.product.application.service.ProductListService;
import com.omie.sdk.modules.product.domain.model.ProductList;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ProductServiceListImpl implements ProductListService {
    private OmieClient omieApiClient;

    public ProductServiceListImpl(OmieClient omieApiClient) {
        this.omieApiClient = omieApiClient;
    }

    @Override
    public ProductList list(int page, int size) {
        Map<String, Object> filters = Map.of(
                "filtrar_apenas_omiepdv", "N"
        );

        String jsonResponse = omieApiClient.execute(
                ProductAction.PRODUCT.getEndpoint(),
                "ListarProdutos",
                page,
                size,
                "N",
                filters
        );

        try {
            Gson gson = new Gson();
            return gson.fromJson(jsonResponse, ProductList.class);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao deserializar o JSON", e);
        }
    }
}
