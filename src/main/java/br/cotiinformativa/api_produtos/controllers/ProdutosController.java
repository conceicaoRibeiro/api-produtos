package br.cotiinformativa.api_produtos.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/produtos")
public class ProdutosController {

    @GetMapping
    public ResponseEntity<?> get() {
        return ResponseEntity.ok().body("Teste consulta de produtos.");
    }
}
