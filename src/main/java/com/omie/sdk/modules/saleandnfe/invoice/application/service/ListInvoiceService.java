package com.omie.sdk.modules.saleandnfe.invoice.application.service;

import com.omie.sdk.modules.saleandnfe.invoice.domain.model.ListInvoice;

public interface ListInvoiceService {
    ListInvoice getInvoices(int page, int size);
}
