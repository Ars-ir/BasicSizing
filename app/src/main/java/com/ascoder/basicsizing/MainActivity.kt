package com.ascoder.basicsizing

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ascoder.basicsizing.ui.theme.BasicSizingTheme
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize(0.7f)
                    .background(color = Color.Green),
                verticalArrangement = Arrangement.SpaceAround,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Columns(name = "Arfan")
                Rows(name = "Arfan")
            }
        }
    }
}

@Composable
fun Columns(name: String) {
    Column(
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Hello")
        Text(text = "world!")
        Text(text = "Welcome $name!")
    }
}

@Composable
fun Rows(name: String) {
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "Hello")
        Text(text = "world!")
        Text(text = "Welcome $name!")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Green),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Columns(name = "Arfan")
        Rows(name = "Arfan")
    }
}