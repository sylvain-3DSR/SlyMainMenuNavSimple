package com.sr.slymainmenunavsimple.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState


@Composable
fun Page3BottomNav(navController: NavHostController) {
    NavigationBar(tonalElevation = 5.dp) {

        val navBackStackEntry = navController.currentBackStackEntryAsState()
        val currentDestination = navBackStackEntry.value?.destination

        NavigationBarItem(
            icon = { Icon(Icons.Default.Home, contentDescription = null) },
            selected = currentDestination?.route == Destination.Page3Home.route,
            onClick = {
                navController.navigate(Destination.Page3Home.route) {
                    popUpTo(Destination.Page3Home.route)
                    launchSingleTop = true
                }
            },
        )

        NavigationBarItem(
            icon = { Icon(Icons.Default.Search, contentDescription = null) },
            selected = currentDestination?.route == Destination.Page3Profile.route,
            onClick = {
                navController.navigate(Destination.Page3Profile.route) {
                    //popUpTo(Destination.Page2Profile.route)
                    launchSingleTop = true
                }
            },
        )

        NavigationBarItem(
            icon = { Icon(Icons.Default.AccountCircle, contentDescription = null) },
            selected = currentDestination?.route == Destination.Page3Search.route,
            onClick = {
                navController.navigate(Destination.Page3Search.route) {
                    //popUpTo(Destination.Page2Profile.route)
                    launchSingleTop = true
                }
            },
        )

    }
}