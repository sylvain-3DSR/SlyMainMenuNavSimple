package com.sr.slymainmenunavsimple.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.sr.slymainmenunavsimple.view.Page2HomeScreen
import com.sr.slymainmenunavsimple.view.Page2ProfileScreen
import com.sr.slymainmenunavsimple.view.Page2SearchScreen
import com.sr.slymainmenunavsimple.view.page3.Page3HomeScreen
import com.sr.slymainmenunavsimple.view.page3.Page3ProfileScreen
import com.sr.slymainmenunavsimple.view.page3.Page3SearchScreen

@Composable
fun Page3Navigation(navController: NavHostController) {
    NavHost(
    navController = navController,
    startDestination = Destination.Page3Home.route,

    ) {
        composable(Destination.Page3Home.route) { Page3HomeScreen() }
        composable(Destination.Page3Profile.route) { Page3ProfileScreen() }
        composable(Destination.Page3Search.route) { Page3SearchScreen() }
    }
}