package com.sr.slymainmenunavsimple.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.sr.slymainmenunavsimple.navigation.Destination

@Composable
fun MainPageScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize().padding(8.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        val buttonHeight = 48.dp
        val roundCorner = 4.dp

        Button(
            modifier = Modifier.fillMaxWidth().height(buttonHeight),
            onClick = { navController.navigate(Destination.Page1.route) },
            shape = RoundedCornerShape(roundCorner)

        ) {
            Text("Button 1")
        }
        Spacer(modifier = Modifier.height(8.dp))

        Button(
            modifier = Modifier.fillMaxWidth().height(buttonHeight),
            onClick = { navController.navigate(Destination.Page2.route) },
            shape = RoundedCornerShape(roundCorner)
        ) {
            Text("Bottom Navigation Material1")
        }

        Spacer(modifier = Modifier.height(8.dp))

        Button(
            modifier = Modifier.fillMaxWidth().height(buttonHeight),
            onClick = { navController.navigate(Destination.Page3.route) },
            shape = RoundedCornerShape(roundCorner)
        ) {
            Text("Button 3")
        }
    }
}