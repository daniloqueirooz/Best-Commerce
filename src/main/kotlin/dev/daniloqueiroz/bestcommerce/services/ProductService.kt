package dev.daniloqueiroz.bestcommerce.services

import dev.daniloqueiroz.bestcommerce.repository.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class ProductService {

    @Autowired
    lateinit var productRepository: ProductRepository
}