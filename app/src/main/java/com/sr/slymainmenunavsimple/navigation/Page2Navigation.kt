package com.sr.slymainmenunavsimple.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.sr.slymainmenunavsimple.view.Page2HomeScreen
import com.sr.slymainmenunavsimple.view.Page2ProfileScreen
import com.sr.slymainmenunavsimple.view.Page2SearchScreen

@Composable
fun Page2Navigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Destination.Page2Home.route,

    ) {
        composable(Destination.Page2Home.route) { Page2HomeScreen() }
        composable(Destination.Page2Profile.route) { Page2ProfileScreen() }
        composable(Destination.Page2Search.route) { Page2SearchScreen() }
    }
}