package com.sobral.compose

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sobral.compose.colors.Purple500
import com.sobral.compose.colors.Teal200
import com.sobral.compose.ui.theme.ApplicationWIthComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ApplicationWIthComposeTheme {
                Surface {
                    ProductsSection()
                }
            }
        }
    }
}

@Composable
fun ProductsSection() {
    Column {
        Text(
            text = "Promoções",
            Modifier.padding(top = 16.dp, bottom = 8.dp, start = 16.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight(400)
        )

        Row(
            Modifier
                .padding(bottom = 16.dp)
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Spacer(Modifier)
            ProductItem(LoremIpsum(100).values.first())
            ProductItem()
            ProductItem(LoremIpsum(20).values.first())
            Spacer(Modifier)
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
                Image(
                    painter = painterResource(id = R.drawable.hamburguer),
                    contentDescription = "Item Image",
                    modifier = Modifier
                        .size(imageSize)
                        .offset(y = imageSize / 2)
                        .clip(shape = CircleShape)
                        .align(BottomCenter),
                    contentScale = ContentScale.Crop
                )
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


@Preview(showBackground = true)
@Composable
private fun ProductsSectionPreview() {
    ProductsSection()
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun ProductItemPreview() {
    ProductItem()
}