package com.fintech.bank.controller;


import com.fintech.bank.dto.TransferenciaRequest;
import com.fintech.bank.service.TransferenciaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;


@RestController
@RequestMapping("api/transferencias")
public class TransferenciaController {

    private final TransferenciaService transferenciaService;

    public TransferenciaController (TransferenciaService transferenciaService){

        this.transferenciaService = transferenciaService;
    }

    @PostMapping
    public ResponseEntity<Void> realizarTransferencia(@RequestBody TransferenciaRequest request) {
        transferenciaService.transferir(request.getCuentaOrigen(), request.getCuentaDestino(), request.getMonto());
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
