package com.example.taksmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taksmanager.ui.theme.TaksManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaksManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ScreenInterface(text1 = getString(R.string.all_tasks_completed), text2 = getString(
                        R.string.nice_work
                    ) )
                }
            }
        }
    }
}

@Composable
fun ScreenInterface(text1: String,text2: String, modifier: Modifier = Modifier){
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment =  Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        ImageInterface()
        TextInterface(text1 = text1, text2 =text2 )
    }
}

@Composable
fun  ImageInterface(modifier: Modifier = Modifier){
    Image(
        painter = painterResource(R.drawable.ic_task_completed),
        contentDescription = null,
        contentScale = ContentScale.Inside,
        modifier = Modifier
            .padding(
                start = 16.dp,
                top = 16.dp,
                end = 16.dp,
                bottom = 16.dp
            )

    )
}

@Composable
fun  TextInterface(text1: String,text2: String, modifier: Modifier = Modifier){
    Text(
        text = text1,
        fontSize = 24.sp,
        lineHeight = 10.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .padding(
                start = 16.dp,
                top = 16.dp,
                end = 16.dp,
                bottom = 16.dp)
    )
    Text(
        text = text2,
        fontSize = 15.sp,
        lineHeight = 10.sp,
        textAlign = TextAlign.Left,
        modifier = Modifier
            .padding(
                start = 16.dp,
                top = 16.dp,
                end = 16.dp,
                bottom = 16.dp)
    )
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TaksManagerTheme {
    ScreenInterface(text1 = "HELLO", text2 ="LALALLA" )
    }
}