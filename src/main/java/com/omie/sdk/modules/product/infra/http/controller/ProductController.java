package com.omie.sdk.modules.product.infra.http.controller;

import com.omie.sdk.modules.product.application.usecase.ListProductUseCase;
import com.omie.sdk.modules.product.domain.model.ProductList;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    private final ListProductUseCase listProductUseCase;

    public ProductController(ListProductUseCase listProductUseCase) {
        this.listProductUseCase = listProductUseCase;
    }

    @GetMapping("/list")
    public ResponseEntity<ProductList> list(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "10") int size
    ) {
        ProductList productList = listProductUseCase.execute(page, size);
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }
}
