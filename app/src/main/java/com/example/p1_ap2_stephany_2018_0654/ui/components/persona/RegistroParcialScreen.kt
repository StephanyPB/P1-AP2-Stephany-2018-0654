package com.example.p1_ap2_stephany_2018_0654.ui.components.persona

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController

@Composable
fun RegistroParcialScreen(navHostController: NavHostController, viewModel: ParcialViewModel = hiltViewModel()
 ){


    Scaffold(
        topBar = { TopAppBar(title = { Text(text = "Registro del parcial") }) }
    ) {
            Column(modifier = Modifier.padding(8.dp)) {

                Button(
                    onClick = {
                        viewModel.Guardar()
                        navHostController.navigateUp()
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 20.dp)
                ) {
                    Text("Guardar ")

                }
            }
    }
}