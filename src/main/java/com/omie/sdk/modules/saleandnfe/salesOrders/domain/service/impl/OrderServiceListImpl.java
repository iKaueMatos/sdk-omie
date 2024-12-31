package com.omie.sdk.modules.saleandnfe.salesOrders.domain.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.omie.sdk.core.Enum.OrderAction;
import com.omie.sdk.core.Infra.client.OmieClient;
import com.omie.sdk.modules.saleandnfe.salesOrders.application.service.OrderServiceList;
import com.omie.sdk.modules.saleandnfe.salesOrders.domain.model.ListOrder;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceListImpl implements OrderServiceList {
    private final OmieClient omieApiClient;
    private final ObjectMapper objectMapper;

    public OrderServiceListImpl(OmieClient omieApiClient, ObjectMapper objectMapper) {
        this.omieApiClient = omieApiClient;
        this.objectMapper = objectMapper;
    }

    /**
     * List orders with pagination.
     *
     * @param page the page number
     * @param size the page size
     * @return the list of orders
     */
    public ListOrder list(int page, int size) {
        if (page < 0 || size <= 0) {
            throw new IllegalArgumentException("Page number must be non-negative and size must be positive");
        }

        String jsonResponse = omieApiClient.execute(
                OrderAction.ORDER.getEndpoint(),
                "ListarPedidos",
                page,
                size,
                "N",
                null
        );

        try {
            return objectMapper.readValue(jsonResponse, ListOrder.class);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao deserializar o JSON", e);
        }
    }
}
