package com.example.coffeemasters

import android.accounts.AuthenticatorDescription
import android.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coffeemasters.ui.theme.Alternative1
import com.example.coffeemasters.ui.theme.Alternative2
import java.time.format.TextStyle

@Preview(showBackground = true, widthDp = 400)
@Composable
private fun Offer_Preview(){
    Offer("My title 1", description = "This is the description")
}

@Preview
@Composable
fun OffersPage(){
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
    ){
        Offer(title = "Early Coffee" , description = "10% Off")
        Offer("Welcome Coffee", "20% Off")
    }
}

@Composable
fun Offer(
    title: String,
    description: String
) {
    val style = androidx.compose.ui.text.TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize =  16.sp
    )

    Box(
        modifier = Modifier
            .padding(16.dp)
    ){
        Image(painter = painterResource(id = R.drawable.background_pattern),
            contentDescription ="Background Pattern",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
        )

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(text = title,
                fontSize = 16.sp,
                style = MaterialTheme.typography.h5,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .background(Alternative2)
                    .padding(16.dp)
            )
            Spacer(
                modifier = Modifier
                    .height(16.dp)
            )
            Text(text =description,
                style = MaterialTheme.typography.h6,
                modifier = Modifier
                    .background(Alternative2)
                    .padding(16.dp)
            )
        }
    }

}