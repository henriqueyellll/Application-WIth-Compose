package com.sobral.compose.ui.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import com.sobral.compose.colors.Purple200
import com.sobral.compose.colors.Purple700

@Composable
fun CardItem() {
    Surface(
        shape = RoundedCornerShape(15.dp),
        shadowElevation = 5.dp
    ) {
        val defaultWidth = 300.dp

        Row(
            Modifier
                .widthIn(defaultWidth)
                .height(200.dp)
        ) {

            Box(
                Modifier
                    .fillMaxHeight()
                    .width(defaultWidth / 3)
                    .background(
                        brush = Brush.verticalGradient(
                            listOf(Purple700, Purple200)
                        )
                    )
            ) {

//                Image(
//
//                    painter = painterResource(id = R),
//                    contentDescription = "Burger",
//                    modifier = Modifier
//                        .offset(x = 50.dp)
//                        .size(100.dp)
//                        .clip(CircleShape)
//                        .align(Alignment.Center)
//                        .border(
//                            BorderStroke(
//                                2.dp, brush = Brush.verticalGradient(
//                                    listOf(
//                                        Purple200, Purple700
//                                    )
//                                )
//                            ), CircleShape
//                        ),
//                    contentScale = ContentScale.Crop
//                )
            }

            Spacer(
                Modifier
                    .width(80.dp)
                    .fillMaxHeight()
            )

            Box(
                Modifier
                    .align(Alignment.CenterVertically)
                    .padding(end = 40.dp)
            ) {
                Text(
                    text = LoremIpsum(200).values.first(),
                    maxLines = 6,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        }
    }
}