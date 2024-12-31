package com.omie.sdk.modules.saleandnfe.invoice.application.usecase;

import com.omie.sdk.modules.saleandnfe.invoice.application.service.ListInvoiceService;
import com.omie.sdk.modules.saleandnfe.invoice.domain.model.ListInvoice;
import org.springframework.stereotype.Component;

@Component
public class ListInvoiceUseCase {
    private final ListInvoiceService listInvoiceService;

    public ListInvoiceUseCase(ListInvoiceService listInvoiceService) {
        this.listInvoiceService = listInvoiceService;
    }

    public ListInvoice execute(int page, int size) {
        return listInvoiceService.getInvoices(page, size);
    }
}
