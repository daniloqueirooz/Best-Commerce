package dev.daniloqueiroz.bestcommerce.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToOne
import jakarta.persistence.Table
import java.math.BigDecimal

@Entity
@Table(name = "customer")
class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private val id: Long? = null

    private lateinit var name: String

    private lateinit var age: BigDecimal

    @OneToOne
    @JoinColumn(name = "customer_type", nullable = false)
    private val customer: CustomerType? = null

}