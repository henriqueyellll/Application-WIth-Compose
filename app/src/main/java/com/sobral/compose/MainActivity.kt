package com.sobral.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.sobral.compose.ui.screens.HomeScreen
import com.sobral.compose.ui.theme.ApplicationWIthComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Composable
fun App() {
    ApplicationWIthComposeTheme {
        Surface {
           HomeScreen()
        }
    }
}