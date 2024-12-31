package com.omie.sdk.modules.product.application.usecase;

import com.omie.sdk.modules.product.application.service.ProductListService;
import com.omie.sdk.modules.product.domain.model.ProductList;
import org.springframework.stereotype.Component;

@Component
public class ListProductUseCase {
    private final ProductListService productListService;

    public ListProductUseCase(ProductListService productListService) {
        this.productListService = productListService;
    }

    public ProductList execute(int page, int size) {
        return productListService.list(page, size);
    }
}
