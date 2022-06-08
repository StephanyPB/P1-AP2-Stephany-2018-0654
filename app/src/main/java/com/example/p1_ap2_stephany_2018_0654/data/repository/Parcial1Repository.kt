package com.example.p1_ap2_stephany_2018_0654.data.repository

import com.example.p1_ap2_stephany_2018_0654.model.Parcial1
import com.example.p1_ap2_stephany_2018_0654.data.Parcial1Dao
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class  Parcial1Repository @Inject constructor(
    val parcial1Dao: Parcial1Dao
)  {
    suspend fun insertar(parcial1: Parcial1){
        parcial1Dao.insertar(parcial1)
    }

    suspend fun eliminar(parcial1: Parcial1){
        parcial1Dao.eliminar(parcial1)
    }

    fun buscar(parcialId: Int): Flow<Parcial1> {
        return   parcial1Dao.buscar(parcialId)
    }

    fun getList(): Flow<List<Parcial1>> {
        return  parcial1Dao.getList()
    }
}

