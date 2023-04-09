package dev.daniloqueiroz.bestcommerce.entity

import jakarta.persistence.*
import java.util.Date

@Entity
@Table(name = "customer_store")
class CustomerStore {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private val id: Long? = null

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private val customer: Customer? = null

    @ManyToOne
    @JoinColumn(name = "store_id", nullable = false)
    private val store: Store? = null

    private val changeDate: Date? = null
}