package com.example.odev4.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Anasayfa(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Anasayfa", fontSize = 42.sp)
        Button(onClick = {
            navController.navigate("sayfaA") {

            }
        }) {
            Text(text = "A Sayfasına Git!")
        }
        Button(onClick = {
            navController.navigate("sayfaX") {

            }
        }) {
            Text(text = "X Sayfasına Git!")
        }
    }
}