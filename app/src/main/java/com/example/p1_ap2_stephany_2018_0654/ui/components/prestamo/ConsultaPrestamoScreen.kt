package com.example.p1_ap2_stephany_2018_0654.ui.components.prestamo

import androidx.compose.foundation.layout.*
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
import com.example.p1_ap2_stephany_2018_0654.ui.components.prestamo.PrestamoViewModel
import com.example.p1_ap2_stephany_2018_0654.ui.components.row.RowPrestamo

@Composable
fun ConsutaPrestamoScreen( navHostController: NavHostController, viewModel: PrestamoViewModel = hiltViewModel()
){
    val ScaffoldState = rememberScaffoldState()

    Scaffold(
        topBar ={
            TopAppBar(title = { Text( "Consulta Prestamo") })
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    navHostController.navigate("RegistroPrestamo")
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
                       RowPrestamo(prestamo = prestamo)

                       Spacer(
                           modifier = Modifier.height(3.dp))
                       Divider(
                           modifier = Modifier
                               .fillMaxWidth().width(2.dp),
                           color = androidx.compose.ui.graphics.Color.Black)
                       Spacer(
                           modifier = Modifier.height(3.dp))
                   }
               }
            }
    }
}

