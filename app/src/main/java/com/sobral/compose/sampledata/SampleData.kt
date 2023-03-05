package com.sobral.compose.sampledata

import com.sobral.compose.R
import com.sobral.compose.model.Product
import java.math.BigDecimal

val sampleProducts = listOf(
    Product(
        name = "Hamburguer",
        price = BigDecimal("12.99"),
        image = R.drawable.hamburguer
    ),
    Product(
        name = "Batata Frita",
        price = BigDecimal("19.99"),
        image = R.drawable.fries
    )
)