package com.example.p1_ap2_stephany_2018_0654.ui.components.persona

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController

@Composable
fun ConsutaParcialScreen( navHostController: NavHostController, viewModel: ParcialViewModel = hiltViewModel()
){
    val ScaffoldState = rememberScaffoldState()

    Scaffold(
        topBar ={
            TopAppBar(title = { Text( "Consulta Parcial") })
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    navHostController.navigate("RegistroParcial")
                },
                backgroundColor = MaterialTheme.colors.primary
            ) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Parcial")
            }
        },
        scaffoldState = ScaffoldState
    ){
           Column(modifier = Modifier.padding(8.dp)) {

            }
    }
}

