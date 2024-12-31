package com.omie.sdk.modules.saleandnfe.salesOrders.domain.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.omie.sdk.core.Infra.client.OmieClient;
import com.omie.sdk.modules.saleandnfe.salesOrders.domain.model.ListOrder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class OrderServiceListImplTest {

    @Mock
    private OmieClient omieApiClient;

    @Mock
    private ObjectMapper objectMapper;

    @InjectMocks
    private OrderServiceListImpl orderServiceList;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testList_Success() throws Exception {
        String jsonResponse = "{\"orders\":[]}";
        ListOrder listOrder = new ListOrder();

        when(omieApiClient.execute(anyString(), anyString(), anyInt(), anyInt(), anyString(), any())).thenReturn(jsonResponse);
        when(objectMapper.readValue(jsonResponse, ListOrder.class)).thenReturn(listOrder);

        ListOrder result = orderServiceList.list(1, 10);

        assertEquals(listOrder, result);
        verify(omieApiClient, times(1)).execute(anyString(), anyString(), anyInt(), anyInt(), anyString(), any());
        verify(objectMapper, times(1)).readValue(jsonResponse, ListOrder.class);
    }

    @Test
    public void testList_InvalidPage() {
        assertThrows(IllegalArgumentException.class, () -> orderServiceList.list(-1, 10));
    }

    @Test
    public void testList_InvalidSize() {
        assertThrows(IllegalArgumentException.class, () -> orderServiceList.list(1, 0));
    }

    @Test
    public void testList_JsonProcessingException() throws Exception {
        String jsonResponse = "{\"orders\":[]}";
        when(omieApiClient.execute(anyString(), anyString(), anyInt(), anyInt(), anyString(), any())).thenReturn(jsonResponse);
        when(objectMapper.readValue(jsonResponse, ListOrder.class)).thenThrow(new RuntimeException("Erro ao deserializar o JSON"));

        assertThrows(RuntimeException.class, () -> orderServiceList.list(1, 10));
    }
}
