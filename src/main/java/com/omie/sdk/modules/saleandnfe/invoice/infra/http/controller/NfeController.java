package com.omie.sdk.modules.saleandnfe.invoice.infra.http.controller;

import com.omie.sdk.modules.saleandnfe.invoice.application.usecase.ListInvoiceUseCase;
import com.omie.sdk.modules.saleandnfe.invoice.domain.model.ListInvoice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/nfe")
public class NfeController {
    private final ListInvoiceUseCase listInvoiceUseCase;

    public NfeController(ListInvoiceUseCase listInvoiceUseCase) {
        this.listInvoiceUseCase = listInvoiceUseCase;
    }

    @GetMapping("/list")
    public ResponseEntity<ListInvoice> list(
            @RequestParam(value = "page", defaultValue = "1") int page,
            @RequestParam(value = "size", defaultValue = "10") int size
    ) {
        ListInvoice listInvoice = listInvoiceUseCase.execute(page, size);
        return new ResponseEntity<>(listInvoice, HttpStatus.OK);
    }
}
