package br.com.ronaldogodoi.aplicativocomercio.model

import java.io.Serializable

data class OrderedProduct (
    val id: String,
    val product: Product,
    val quantity: Int) : Serializable