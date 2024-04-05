package com.dol.jetpackanimations.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController


@Composable
fun HomeScreen(
    onPongGameClick : () -> Unit
) {
    Column(modifier =  Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, Alignment.CenterHorizontally) {
        Button(onClick = { onPongGameClick.invoke() }) {
            Text(text = "Enter Pong Game")
        }

    }
}