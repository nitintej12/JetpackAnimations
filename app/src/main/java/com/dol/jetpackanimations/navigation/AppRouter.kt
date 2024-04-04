package com.dol.jetpackanimations.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dol.jetpackanimations.home.HomeScreen
import com.dol.jetpackanimations.pong.PongGameScreen

private object Route {
    const val PONG_GAME = "pong"
    const val HOME = "home"

}

sealed class Screen(val route: String) {
    object PongGame : Screen(Route.PONG_GAME)
    object Home : Screen(Route.HOME)
}

@Composable
fun RootNavHost() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(Screen.PongGame.route) {
            PongGameScreen()
        }
        composable(Screen.Home.route) {
            HomeScreen {
                navController.navigate(Screen.PongGame.route)
            }
        }
    }
}