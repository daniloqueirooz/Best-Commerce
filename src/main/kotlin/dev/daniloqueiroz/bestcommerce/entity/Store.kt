package dev.daniloqueiroz.bestcommerce.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Table
import jakarta.persistence.Id

@Entity
@Table(name = "store")
class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private val id: Long? = null

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private lateinit var name: String


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private lateinit var andress: String

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private lateinit var number: Number

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private lateinit var neighbot: String

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private lateinit var state: String

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private lateinit var city: String

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private lateinit var country: String

}
