package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

val textColor:Color = Color.White

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Box (
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Image(
            painter = painterResource(R.drawable._31931279065201),
            contentDescription = "Background Image",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .fillMaxSize()
        )

        Column (modifier = Modifier
            .padding(16.dp)
        ) {
            Image(
                painter = painterResource(R.drawable._516700400141),
                contentDescription = "Here",
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .clip(CircleShape)
                    .size(200.dp)
                    .align(alignment = Alignment.CenterHorizontally),
            )
            Text(
                text = "Matthew Moore",
                color = textColor,
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)

            )
            Text(
                text = "Application Security Engineer",
                color = textColor,
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
                )


        }


    }

    // If you want, you can add rows to adds icons to each text composable
    // Also add padding between the text composables
    Column(modifier = Modifier
        .padding(16.dp)
        .fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "832-454-3882",
            color = textColor,
            textAlign = TextAlign.Center
        )
        Text(
            text = "@Ecyg",
            color = textColor,
            textAlign = TextAlign.Center
        )
        Text(
            text = "matthew.ke.moore@gmail.com",
            color = textColor,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(bottom = 20.dp)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        Greeting("Android")
    }
}