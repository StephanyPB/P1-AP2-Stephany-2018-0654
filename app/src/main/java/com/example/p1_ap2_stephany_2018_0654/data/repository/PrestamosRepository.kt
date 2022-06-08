package com.example.p1_ap2_stephany_2018_0654.data.repository

import com.example.p1_ap2_stephany_2018_0654.model.Prestamo
import com.example.p1_ap2_stephany_2018_0654.data.PrestamoDao
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class  PrestamosRepository @Inject constructor(
    val prestamoDao: PrestamoDao
)  {
    suspend fun insertar(prestamo: Prestamo){
        prestamoDao.insertar(prestamo)
    }

    suspend fun eliminar(prestamo: Prestamo){
        prestamoDao.eliminar(prestamo)
    }

    fun buscar(prestamoId: Int): Flow<Prestamo> {
        return   prestamoDao.buscar(prestamoId)
    }

    fun getList(): Flow<List<Prestamo>> {
        return  prestamoDao.getList()
    }
}

