package com.bright.mycompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bright.mycompose.ui.theme.MyComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //fundamental building block in Jetpack Compose(modern UI toolkit for Android)
        setContent {
            MyComposeTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    MyMessage("Welcome to Compose")
                }
            }

        }
    }
}

@Composable
fun MyMessage(message: String) {
    Row {
        Image(
            painter = painterResource(id = R.drawable.mydog),
            contentDescription = "my dog",
            modifier = Modifier
                .clip(CircleShape)
                .size(100.dp)
                .border(2.dp, Color.Red, CircleShape)
        )
        Spacer(modifier = Modifier.width(10.dp))
        Column {
            Text(
                text = message,
                color = Color.Magenta
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "This is my dog.",
                color = Color.Red
            )
        }
    }

}

@Preview
@Composable
fun PreviewMyMessage() {
    MyComposeTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            MyMessage(message = "Welcome to Compose Preview")
        }
    }

}

