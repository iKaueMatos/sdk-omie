package com.omie.sdk.modules.saleandnfe.invoice.domain.service.impl;

import com.google.gson.Gson;
import com.omie.sdk.core.Enum.InvoicesAction;
import com.omie.sdk.core.Infra.client.OmieClient;
import com.omie.sdk.modules.saleandnfe.invoice.application.service.ListInvoiceService;
import com.omie.sdk.modules.saleandnfe.invoice.domain.model.ListInvoice;
import org.springframework.stereotype.Service;

@Service
public class ListInvoiceServiceImpl implements ListInvoiceService {
    private final OmieClient omieApiClient;

    public ListInvoiceServiceImpl(OmieClient omieApiClient) {
        this.omieApiClient = omieApiClient;
    }

    @Override
    public ListInvoice getInvoices(int page, int size) {
        String jsonResponse = omieApiClient.execute(
                InvoicesAction.INVOICE.getEndpoint(),
                "ListarNF",
                page,
                size,
                "N",
                null
        );

        try {
            Gson gson = new Gson();
            return gson.fromJson(jsonResponse, ListInvoice.class);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao deserializar o JSON", e);
        }
    }
}
