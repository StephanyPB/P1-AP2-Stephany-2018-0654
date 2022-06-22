package com.example.p1_ap2_stephany_2018_0654.ui.components.row

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.p1_ap2_stephany_2018_0654.model.Prestamo


@Composable
fun RowPrestamo (prestamo: Prestamo) {
    Column(
        modifier = androidx.compose.ui.Modifier.fillMaxWidth()
    ){
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = androidx.compose.ui.Modifier.fillMaxWidth()
                .height(25.dp)

        ) {
            Text(prestamo.deudor)
            Text( prestamo.monto.toString(),
                style = MaterialTheme.typography.h5
            )
        }

        Row(
            horizontalArrangement = Arrangement.Start,
            modifier = androidx.compose.ui.Modifier.fillMaxWidth()
        ) {
            Text(prestamo.concepto,
                style = MaterialTheme.typography.caption)
        }
    }
}