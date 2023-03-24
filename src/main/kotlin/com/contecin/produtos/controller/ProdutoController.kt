package com.contecin.produtos.controller

import org.springframework.core.env.Environment
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/estoque-de-produtos")
class ProdutoController(
    private val env: Environment
) {

    @GetMapping("/listagem")
    fun listagemDeProdutos(): ResponseEntity<String> =
        ResponseEntity.ok("Listagem de produtos, node: ${env.getProperty("local.server.port")}")

}