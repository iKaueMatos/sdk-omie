package com.omie.sdk.modules.saleandnfe.salesOrders.application.service;

import com.omie.sdk.modules.saleandnfe.salesOrders.domain.model.ListOrder;

public interface OrderServiceList {
    ListOrder list(int page, int size);
}
