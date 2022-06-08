package com.example.p1_ap2_stephany_2018_0654.ui.components.persona

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.p1_ap2_stephany_2018_0654.data.repository.Parcial1Repository
import com.example.p1_ap2_stephany_2018_0654.model.Parcial1
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ParcialViewModel @Inject constructor(
    val parcial1Repository: Parcial1Repository
): ViewModel() {
    var parcial = parcial1Repository.getList()
    var parcialId by mutableStateOf(0)

    fun Guardar(){
        viewModelScope.launch {
            parcial1Repository.insertar(
                Parcial1(
                    parcialId = parcialId
                )
            )
        }
    }

}

