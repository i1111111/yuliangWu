package com.example.yuliangwu

import android.graphics.Canvas
import android.graphics.Color
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.yuliangwu.R.drawable
import com.example.yuliangwu.ui.theme.YuliangWuTheme
import androidx.compose.foundation.Image as Image
import androidx.compose.material.Text as Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            YuliangWuTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "作者: 資管二A $name")
        Image(
            painter = painterResource(id = R.drawable.map),
            contentDescription = "圖片",
            modifier = Modifier
        )
    }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            drawRect(color = Blue, topLeft = Offset(790f, 220f), size = Size(20f, 20f))
            drawRect(color = Blue, topLeft = Offset(1610f, 910f), size = Size(20f, 20f))
        }
    }



}

fun drawRect(blue: Int, fl: Float, offset: Offset, size: Size) {

}

fun drawRect(blue: Int, fl: Float, offset: Offset) {

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    YuliangWuTheme {
        Greeting("Android")
    }
}



