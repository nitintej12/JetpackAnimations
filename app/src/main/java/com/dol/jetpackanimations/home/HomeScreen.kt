package com.dol.jetpackanimations.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController


@Composable
fun HomeScreen(
    onPongGameClick : () -> Unit
) {
    val navigator = rememberNavController()

    Column {
        Button(onClick = { onPongGameClick.invoke() }) {
            Text(text = "Enter Pong Game")
        }

    }
}