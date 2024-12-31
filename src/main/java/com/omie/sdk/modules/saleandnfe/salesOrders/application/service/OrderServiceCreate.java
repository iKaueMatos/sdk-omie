package com.omie.sdk.modules.saleandnfe.salesOrders.application.service;

import com.omie.sdk.modules.saleandnfe.salesOrders.domain.model.AddOrder;

public interface OrderServiceCreate {
    AddOrder create(AddOrder addOrder);
}
