package com.sr.slymainmenunavsimple.view

import android.annotation.SuppressLint
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
import com.sr.slymainmenunavsimple.navigation.Page2Navigation

@Composable
fun Page2Screen(){

    val navController = rememberNavController()
    Page2Scaffold(navController = navController)

}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Page2Scaffold(navController: NavHostController) {

    // Scaffold Material 1
    val scaffoldState = rememberScaffoldState()

    Scaffold(
        scaffoldState = scaffoldState,
        bottomBar = {
            Page2BottomNav(navController = navController)
        }
    ) {
        Page2Navigation(navController = navController)
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