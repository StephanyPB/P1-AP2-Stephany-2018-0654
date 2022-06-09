package com.example.p1_ap2_stephany_2018_0654.ui.components.prestamo

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.p1_ap2_stephany_2018_0654.ui.components.prestamo.PrestamoViewModel

@Composable
fun RegistroPrestamoScreen(navHostController: NavHostController, viewModel: PrestamoViewModel = hiltViewModel()
 ){

    var valDeudor by rememberSaveable { mutableStateOf(false) }
    var valConcepto by rememberSaveable { mutableStateOf(false) }
    var valMonto by rememberSaveable { mutableStateOf(false) }
    val context = LocalContext.current
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
                        valDeudor = viewModel.deudor.isBlank()
                        valConcepto = viewModel.deudor.isBlank()
                        valMonto = viewModel.deudor.isBlank()
                        if(!valDeudor && !valConcepto && !valMonto){
                            viewModel.Guardar()
                            navHostController.navigateUp()
                        }
                        else{
                            Toast.makeText(context, "Transacion fallida", Toast.LENGTH_SHORT).show()
                        }
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
