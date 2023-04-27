package com.sr.slymainmenunavsimple.view

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.sr.slymainmenunavsimple.navigation.Destination
import com.sr.slymainmenunavsimple.navigation.Page3BottomNav
import com.sr.slymainmenunavsimple.navigation.Page3Navigation


@Composable
fun Page3Screen() {

    val navController = rememberNavController()
    Page3Scaffold(navController = navController)

}


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Page3Scaffold(navController: NavHostController){

    // Scaffold Material 3

    val navBackStackEntry = navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry.value?.destination

    Scaffold(
        bottomBar = {
            Page3BottomNav(navController = navController)
        }
    ) {
        Page3Navigation(navController = navController)
    }
}