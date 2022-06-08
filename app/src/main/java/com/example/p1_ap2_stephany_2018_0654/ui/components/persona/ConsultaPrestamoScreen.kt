package com.example.p1_ap2_stephany_2018_0654.ui.components.persona

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController

@Composable
fun ConsutaPrestamoScreen( navHostController: NavHostController, viewModel: PrestamoViewModel = hiltViewModel()
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
                Icon(imageVector = Icons.Default.Add, contentDescription = "Prestamo")
            }
        },
        scaffoldState = ScaffoldState
    ){
           Column(modifier = Modifier.padding(8.dp)) {
               val listaPrestamos = viewModel.parcial.collectAsState(initial = emptyList())

               LazyColumn(modifier = Modifier.fillMaxWidth()) {
                   items(listaPrestamos.value) { prestamo ->
                       Row() {
                           Text( "${prestamo.prestamoId}\t\t\t " +
                                   "${prestamo.deudor}\t\t\t " +
                                   "${prestamo.concepto}\t\t\t " +
                                   "${prestamo.monto}")
                       }
                   }
               }
            }
    }
}

