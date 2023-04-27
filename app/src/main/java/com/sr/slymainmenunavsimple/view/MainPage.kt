package com.sr.slymainmenunavsimple.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun MainPage(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Button(onClick = { navController.navigate("page_1") }) {
            Text("Button 1")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { navController.navigate("page_2") }) {
            Text("Button 2")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { navController.navigate("page_3") }) {
            Text("Button 3")
        }

    }
}