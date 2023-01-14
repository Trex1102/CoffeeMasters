package com.example.coffeemasters

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Preview
@Composable
fun App(){
    Scaffold(
        topBar = {},
        bottomBar = {}
    ) {
        Text("This is my App's content")
    }
}


@Preview
@Composable
fun AppTitle(){
}