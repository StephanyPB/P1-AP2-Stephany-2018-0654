package com.example.p1_ap2_stephany_2018_0654.ui.components.prestamo

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.p1_ap2_stephany_2018_0654.data.repository.PrestamosRepository
import com.example.p1_ap2_stephany_2018_0654.model.Prestamo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PrestamoViewModel @Inject constructor(
    val prestamosRepository: PrestamosRepository
): ViewModel() {
    var parcial = prestamosRepository.getList()
    private set

    var deudor by mutableStateOf("")
    var concepto by mutableStateOf("")
    var monto by mutableStateOf("")

    fun Guardar(){
        viewModelScope.launch {
            prestamosRepository.insertar(
                Prestamo(
                deudor = deudor,
                    concepto = concepto,
                    monto = monto.toString().toFloat()
                )
            )
        }
    }

}

