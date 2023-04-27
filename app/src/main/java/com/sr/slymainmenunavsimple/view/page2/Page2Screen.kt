package com.sr.slymainmenunavsimple.view

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
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

}