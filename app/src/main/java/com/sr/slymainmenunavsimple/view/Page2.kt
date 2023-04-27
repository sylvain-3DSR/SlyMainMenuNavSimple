package com.sr.slymainmenunavsimple.view

import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Page2() {

    Text("Page 2")

    Scaffold(
        bottomBar = { BottomAppBar {

            }
        }
    ) {
        // Screen content
        Text(text = "")
    }

}