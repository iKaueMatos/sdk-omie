package com.omie.sdk.modules.saleandnfe.salesOrders.application.usecase;

import com.omie.sdk.modules.saleandnfe.salesOrders.application.service.OrderServiceList;
import com.omie.sdk.modules.saleandnfe.salesOrders.domain.model.ListOrder;
import org.springframework.stereotype.Component;

@Component
public class ListOrderUseCase {
    private final OrderServiceList orderServiceList;

    public ListOrderUseCase(OrderServiceList orderServiceList) {
        this.orderServiceList = orderServiceList;
    }

    public ListOrder execute(int page, int size) {
        return orderServiceList.list(page, size);
    }
}
