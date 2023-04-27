package com.sr.slymainmenunavsimple.view

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sr.slymainmenunavsimple.navigation.Destination
import com.sr.slymainmenunavsimple.navigation.Page2BottomNav

@Composable
fun Page2Screen(){

    val navController = rememberNavController()
    Page2Scaffold(navController = navController)

}

@Composable
fun Page2Scaffold(navController: NavHostController) {

    // Scaffold Material 1
    val scaffoldState = rememberScaffoldState()

    Scaffold(
        scaffoldState = scaffoldState,
        bottomBar = {
            Page2BottomNav(navController = navController)
        }
    ) {paddingValues ->
        NavHost(navController = navController, startDestination = Destination.Page2Home.route, modifier = Modifier.padding(paddingValues)) {
            composable(Destination.Page2Home.route) {
                Page2HomeScreen()
            }
            composable(Destination.Page2Profile.route) {
                Page2ProfileScreen()
            }
            composable(Destination.Page2Search.route) {
                Page2SearchScreen()
            }
        }
    }



    /*
    // SCaffold Material 3
    Scaffold(


        bottomBar = {
            NavigationBar {

                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = null) },
                    selected = false,
                    onClick = { /*TODO*/ },
                )

                NavigationBarItem(
                    icon = { Icon(Icons.Default.Search, contentDescription = null) },
                    selected = true,
                    onClick = { /*TODO*/ },
                )

                NavigationBarItem(
                    icon = { Icon(Icons.Default.AccountCircle, contentDescription = null) },
                    selected = false,
                    onClick = { /*TODO*/ },
                )

            }
        }
    ) {
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(it)) {

        }
    }

     */
}