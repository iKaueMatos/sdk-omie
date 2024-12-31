package com.omie.sdk.modules.saleandnfe.salesOrders.infra.http.controller;

import com.omie.sdk.modules.saleandnfe.salesOrders.application.usecase.ListOrderUseCase;
import com.omie.sdk.modules.saleandnfe.salesOrders.domain.model.ListOrder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order-sales")
public class OrderSaleProductController {
    private final ListOrderUseCase listOrderUseCase;

    public OrderSaleProductController(ListOrderUseCase listOrderUseCase) {
        this.listOrderUseCase = listOrderUseCase;
    }

    @GetMapping("/list")
    public ResponseEntity<ListOrder> list(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "10") int size
    ) {
        ListOrder listOrder = listOrderUseCase.execute(page, size);
        return new ResponseEntity<>(listOrder, HttpStatus.OK);
    }
}
