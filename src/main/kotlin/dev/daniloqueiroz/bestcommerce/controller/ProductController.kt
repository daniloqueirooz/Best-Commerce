package dev.daniloqueiroz.bestcommerce.controller

import dev.daniloqueiroz.bestcommerce.entity.Product
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.math.BigDecimal

@RestController
@RequestMapping("/products")
class ProductController {

    @GetMapping(name = "/")
    fun listAll(): List<Product> {
        return mutableListOf(
            Product(id = 1L, name = "Teste1", price = BigDecimal("10.9")),
            Product(id = 1L, name = "Teste2", price = BigDecimal("7.9")),
            Product(id = 1L, name = "Teste3", price = BigDecimal("3.9"))
        )
    }
}