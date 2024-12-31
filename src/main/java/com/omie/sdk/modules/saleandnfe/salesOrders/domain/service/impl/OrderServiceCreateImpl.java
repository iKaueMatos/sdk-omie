package com.omie.sdk.modules.saleandnfe.salesOrders.domain.service.impl;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.omie.sdk.core.Enum.OrderAction;
import com.omie.sdk.core.Infra.client.OmieClient;
import com.omie.sdk.modules.saleandnfe.salesOrders.application.service.OrderServiceCreate;
import com.omie.sdk.modules.saleandnfe.salesOrders.domain.model.AddOrder;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class OrderServiceCreateImpl implements OrderServiceCreate {
    private final OmieClient omieApiClient;
    private final Gson gson;

    public OrderServiceCreateImpl(OmieClient omieApiClient) {
        this.omieApiClient = omieApiClient;
        this.gson = new Gson();
    }

    @Override
    public AddOrder create(AddOrder addOrder) {
        Map<String, Object> createOrder = buildCreateOrderMap(addOrder);

        String jsonResponse = omieApiClient.execute(
                OrderAction.ORDER_SALE.getEndpoint(),
                "AdicionarPedido",
                0,
                0,
                "",
                createOrder
        );

        return parseJsonResponse(jsonResponse);
    }

    private Map<String, Object> buildCreateOrderMap(AddOrder addOrder) {
        return Map.of(
                "codigo_pedido_integracao", addOrder.getIntegrationOrderCode(),
                "codigo_cliente", addOrder.getClientCode(),
                "codigo_cenario_imposto", addOrder.getTaxScenarioCode(),
                "itens", addOrder.getItems()
        );
    }

    private AddOrder parseJsonResponse(String jsonResponse) {
        try {
            return gson.fromJson(jsonResponse, AddOrder.class);
        } catch (JsonSyntaxException e) {
            throw new RuntimeException("Erro ao deserializar o JSON", e);
        }
    }
}