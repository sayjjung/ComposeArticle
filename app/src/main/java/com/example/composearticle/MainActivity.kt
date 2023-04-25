package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(title = stringResource(R.string.title_compose_tutorial),
                        text1 = stringResource(R.string.text1_compose_tutorial),
                        text2=stringResource(R.string.text2_compose_tutorial))
                }
            }
        }
    }
}

@Composable
fun Greeting(title: String, text1: String, text2: String, modifier: Modifier = Modifier) {
    val topImage = painterResource(R.drawable.bg_compose_background )

    Column(    )
    {
        //Top 이미지
        Image(
            painter = topImage,
            contentDescription = null
        )

        // 제목
        Text(
            text = title,
            modifier = modifier.padding(16.dp),
            fontSize = 24.sp,
            textAlign = TextAlign.Start
        )

        Text(
            text = text1,
            modifier = modifier.padding( start=16.dp, end=16.dp),
            textAlign = TextAlign.Justify
        )

        Text(
            text = text2,
            modifier = modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeArticleTheme {
        Greeting(title = stringResource(R.string.title_compose_tutorial),
            text1 = stringResource(R.string.text1_compose_tutorial),
            text2=stringResource(R.string.text2_compose_tutorial))
    }
}