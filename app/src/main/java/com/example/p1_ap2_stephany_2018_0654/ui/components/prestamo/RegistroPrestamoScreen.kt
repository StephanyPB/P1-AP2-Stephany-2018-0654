package com.example.p1_ap2_stephany_2018_0654.ui.components.prestamo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.p1_ap2_stephany_2018_0654.ui.components.prestamo.PrestamoViewModel

@Composable
fun RegistroPrestamoScreen(navHostController: NavHostController, viewModel: PrestamoViewModel = hiltViewModel()
 ){


    Scaffold(
        topBar = { TopAppBar(title = { Text(text = "Registro Prestamos") }) }
    ) {
            Column(modifier = Modifier.padding(8.dp)) {

                OutlinedTextField(
                    value = viewModel.deudor,
                    onValueChange = {viewModel.deudor = it},
                    modifier = Modifier.fillMaxWidth(),
                    label = {
                        Text(text = "Deudor")
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = null)
                    }
                )
                OutlinedTextField(
                    value = viewModel.concepto,
                    onValueChange = {viewModel.concepto = it},
                    modifier = Modifier.fillMaxWidth(),
                    label = {
                        Text(text = "Concepto")
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Info,
                            contentDescription = null)
                    }
                )

                OutlinedTextField(
                    label = { Text("Monto:") },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.ShoppingCart,
                            contentDescription = null) },
                    value = viewModel.monto,
                    onValueChange = { viewModel.monto = it },
                    modifier = Modifier.fillMaxWidth()
                )

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