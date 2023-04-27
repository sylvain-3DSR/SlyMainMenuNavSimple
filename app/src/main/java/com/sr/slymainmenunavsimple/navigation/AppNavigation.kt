package com.sr.slymainmenunavsimple.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sr.slymainmenunavsimple.view.MainPage
import com.sr.slymainmenunavsimple.view.Page1
import com.sr.slymainmenunavsimple.view.Page2
import com.sr.slymainmenunavsimple.view.Page3

@Composable
fun AppNavigation() {

    // navController enable to navigate from one screen to another
    // we are getting an instance of navController using rememberNavController()
    val navController = rememberNavController()


    // Structure around navController where we define
    // which screen are available to move between
    NavHost(
        navController = navController,
        startDestination = "main_page"
    ) {
        composable("main_page") { MainPage(navController) }
        composable("page_1") { Page1() }
        composable("page_2") { Page2() }
        composable("page_3") { Page3() }
    }

}