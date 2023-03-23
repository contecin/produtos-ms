package com.contecin.produtos

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class ProdutosMsApplication

fun main(args: Array<String>) {
    runApplication<ProdutosMsApplication>(*args)
}
