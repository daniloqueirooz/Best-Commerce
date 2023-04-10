package dev.daniloqueiroz.bestcommerce.repository

import dev.daniloqueiroz.bestcommerce.entity.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface ProductRepository : JpaRepository<Product, Long> {
}