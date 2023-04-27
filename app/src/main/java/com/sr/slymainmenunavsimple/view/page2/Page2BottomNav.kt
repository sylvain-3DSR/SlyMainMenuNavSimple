package com.sr.slymainmenunavsimple.navigation

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.sr.slymainmenunavsimple.R

@Composable
fun Page2BottomNav(navController: NavHostController) {
    BottomNavigation(elevation = 5.dp) {

        val navBackStackEntry = navController.currentBackStackEntryAsState()
        val currentDestination = navBackStackEntry.value?.destination

        val iconPage2Home = painterResource(id = R.drawable.home)
        val iconPage2Profile = painterResource(id = R.drawable.account_circle)
        val iconPage2Search =  painterResource(id = R.drawable.search)
        
        BottomNavigationItem(
            selected = currentDestination?.route == Destination.Page2Home.route,
            onClick = {
                navController.navigate(Destination.Page2Home.route) {
                    popUpTo(Destination.Page2Home.route)
                    launchSingleTop = true
                }
            },
            icon = { Icon(painter = iconPage2Home, contentDescription = null ) },
            //label = { Text(text = Destination.Page2Home.route) }
        )

        BottomNavigationItem(
            selected = currentDestination?.route == Destination.Page2Profile.route,
            onClick = {
                navController.navigate(Destination.Page2Profile.route) {
                    //popUpTo(Destination.Page2Profile.route)
                    launchSingleTop = true
                }
            },
            icon = { Icon(painter = iconPage2Profile, contentDescription = null ) },
            //label = { Text(text = Destination.Page2Profile.route) }
        )

        BottomNavigationItem(
            selected = currentDestination?.route == Destination.Page2Search.route,
            onClick = {
                navController.navigate(Destination.Page2Search.route) {
                    //popUpTo(Destination.Page2Search.route)
                    launchSingleTop = true
                }
            },
            icon = { Icon(painter = iconPage2Search, contentDescription =  null ) },
            //label = { Text(text = Destination.Page2Search.route) }
        )


    }
}
