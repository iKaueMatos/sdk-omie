package com.omie.sdk.modules.product.application.service;

import com.omie.sdk.modules.product.domain.model.ProductList;

public interface ProductListService {
    ProductList list(int page, int size);
}
