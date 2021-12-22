package br.com.ronaldogodoi.aplicativocomercio.model

import java.io.Serializable


data class User (
    val id: String,
    val email: String,
    val name: String,
    val surname: String,
    val password: String,
    val image: String,
    val addresses: List<UserAddress>) : Serializable