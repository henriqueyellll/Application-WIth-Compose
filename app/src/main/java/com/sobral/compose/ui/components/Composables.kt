package com.sobral.compose.ui.components

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sobral.compose.ui.colors.Purple200
import com.sobral.compose.ui.colors.Purple500
import com.sobral.compose.ui.colors.Purple700
import com.sobral.compose.ui.colors.Teal200

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

@Composable
fun ProductItem(description: String = "") {
    Surface(
        shape = RoundedCornerShape(15.dp), shadowElevation = 5.dp
    ) {
        Column(
            Modifier
                .width(200.dp)
                .heightIn(250.dp, 260.dp)
                .background(Color.White)
                .verticalScroll(rememberScrollState())
        ) {
            val imageSize = 100.dp

            Box(
                Modifier
                    .fillMaxWidth()
                    .height(imageSize)
                    .background(
                        brush = Brush.horizontalGradient(
                            listOf(
                                Purple500,
                                Teal200
                            )
                        )
                    )
            ) {
//                Image(
//                    painter = painterResource(id = R.drawable.hamburguer),
//                    contentDescription = "Item Image",
//                    modifier = Modifier
//                        .size(imageSize)
//                        .offset(y = imageSize / 2)
//                        .clip(shape = CircleShape)
//                        .align(Alignment.BottomCenter),
//                    contentScale = ContentScale.Crop
//                )
            }

            Spacer(
                Modifier
                    .fillMaxWidth()
                    .height(imageSize / 2)
            )

            Column(
                Modifier
                    .padding(top = 16.dp, start = 16.dp, end = 16.dp, bottom = 16.dp)
                    .fillMaxHeight()
            ) {
                Text(
                    text = LoremIpsum(50).values.first(),
                    fontSize = 18.sp,
                    fontWeight = FontWeight(700),
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )

                Text(
                    text = "R$ 14,99",
                    fontSize = 14.sp,
                    fontWeight = FontWeight(401),
                    modifier = Modifier.padding(top = 8.dp)
                )
            }

            if (description.isNotEmpty()) {
                Text(
                    text = description,
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400),
                    color = Color.White,
                    modifier = Modifier
                        .background(color = Purple500)
                        .padding(16.dp)
                )

            }
        }
    }
}