package com.omie.sdk.modules.saleandnfe.salesOrders.domain.service.impl;

import com.omie.sdk.core.Enum.OrderAction;
import com.omie.sdk.core.Infra.client.OmieClient;
import com.omie.sdk.modules.saleandnfe.salesOrders.domain.model.AddOrder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

class OrderServiceCreateImplTest {
    private OmieClient omieApiClient;
    private OrderServiceCreateImpl orderServiceCreate;

    @BeforeEach
    void setUp() {
        omieApiClient = Mockito.mock(OmieClient.class);
        orderServiceCreate = new OrderServiceCreateImpl(omieApiClient);
    }

    @Test
    void testCreateOrderSuccess() {
        AddOrder addOrder = new AddOrder();
        addOrder.setIntegrationOrderCode("123");
        addOrder.setClientCode("456");
        addOrder.setTaxScenarioCode("789");
        addOrder.setItems(List.of());

        String jsonResponse = "{\"integrationOrderCode\":\"123\",\"clientCode\":\"456\",\"taxScenarioCode\":\"789\",\"items\":[]}";

        when(omieApiClient.execute(
                eq(OrderAction.ORDER_SALE.getEndpoint()),
                eq("AdicionarPedido"),
                eq(0),
                eq(0),
                eq(""),
                any(Map.class)
        )).thenReturn(jsonResponse);

        AddOrder result = orderServiceCreate.create(addOrder);

        assertEquals("123", result.getIntegrationOrderCode());
        assertEquals("456", result.getClientCode());
        assertEquals("789", result.getTaxScenarioCode());
        assertTrue(result.getItems().isEmpty());
    }

    @Test
    void testCreateOrderJsonSyntaxException() {
        AddOrder addOrder = new AddOrder();
        addOrder.setIntegrationOrderCode("123");
        addOrder.setClientCode("456");
        addOrder.setTaxScenarioCode("789");
        addOrder.setItems(List.of());

        String invalidJsonResponse = "invalid json";

        when(omieApiClient.execute(
                eq(OrderAction.ORDER_SALE.getEndpoint()),
                eq("AdicionarPedido"),
                eq(0),
                eq(0),
                eq(""),
                any(Map.class)
        )).thenReturn(invalidJsonResponse);

        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            orderServiceCreate.create(addOrder);
        });

        assertEquals("Erro ao deserializar o JSON", exception.getMessage());
    }
}
