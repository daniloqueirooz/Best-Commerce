package dev.daniloqueiroz.bestcommerce.controller

import dev.daniloqueiroz.bestcommerce.entity.Product
import dev.daniloqueiroz.bestcommerce.repository.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.math.BigDecimal

@RestController
@RequestMapping("/products")
class ProductController {

    @Autowired
    lateinit var repository: ProductRepository

    @GetMapping(name = "/")
    fun listAll(): List<Product> {
        return mutableListOf(
            Product(id = 1L, name = "Apple", price = BigDecimal("10.9")),
            Product(id = 1L, name = "Banana", price = BigDecimal("7.9")),
            Product(id = 1L, name = "Kiwi", price = BigDecimal("3.9"))
        )
    }
}
