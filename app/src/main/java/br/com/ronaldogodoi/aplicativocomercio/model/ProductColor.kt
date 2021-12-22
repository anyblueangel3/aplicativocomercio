package br.com.ronaldogodoi.aplicativocomercio.model

import java.io.Serializable

data class ProductColor(
    val id: String,
    val name: String,
    val code: String) : Serializable