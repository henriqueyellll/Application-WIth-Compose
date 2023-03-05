package com.sobral.compose.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sobral.compose.R
import com.sobral.compose.ui.components.ProductsSection
import com.sobral.compose.model.Product
import com.sobral.compose.model.Category
import com.sobral.compose.sampledata.sampleProducts
import java.math.BigDecimal

@Composable
fun HomeScreen() {
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Spacer(Modifier)
        ProductsSection(
            Category(
                title = "Promoções",
                products = sampleProducts
            )
        )
        ProductsSection(
            Category(
                title = "Doces",
                products = listOf(
                    Product("Chocolate", BigDecimal("5.99"), R.drawable.place_holder)
                )
            )
        )
        ProductsSection(
            Category(
                title = "Bebidas",
                products = sampleProducts
            )
        )
        Spacer(Modifier)
    }
}

@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}