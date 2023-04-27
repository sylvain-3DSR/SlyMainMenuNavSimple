package com.sr.slymainmenunavsimple.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sr.slymainmenunavsimple.view.MainPageScreen
import com.sr.slymainmenunavsimple.view.Page1Screen
import com.sr.slymainmenunavsimple.view.Page2Screen
import com.sr.slymainmenunavsimple.view.Page3Screen

@Composable
fun AppMainNavigation() {

    // navController enable to navigate from one screen to another
    // we are getting an instance of navController using rememberNavController()
    val navController = rememberNavController()

    // Structure around navController where we define
    // which screen are available to move between
    NavHost(
        navController = navController,
        startDestination = "main_page"
    ) {
        composable(Destination.MainPage.route) { MainPageScreen(navController) }
        composable(Destination.Page1.route) { Page1Screen() }
        composable(Destination.Page2.route) { Page2Screen() }
        composable(Destination.Page3.route) { Page3Screen() }
    }
}