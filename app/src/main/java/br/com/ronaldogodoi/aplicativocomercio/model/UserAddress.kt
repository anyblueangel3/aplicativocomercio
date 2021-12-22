package br.com.ronaldogodoi.aplicativocomercio.model

import java.io.Serializable

data class UserAddress (
    val id: String,
    val user: User,
    val addressLine1: String,
    val addressLine2: String,
    val number: String,
    val state: String,
    val city: String,
    val zipCode: String,
    val country: String) : Serializable