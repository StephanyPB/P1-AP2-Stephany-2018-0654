package com.example.p1_ap2_stephany_2018_0654.data

import androidx.room.*
import com.example.p1_ap2_stephany_2018_0654.model.Parcial1
import kotlinx.coroutines.flow.Flow

@Dao
interface Parcial1Dao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertar(parcial1: Parcial1)

    @Delete
    suspend fun eliminar(parcial1: Parcial1)

    @Query("""
        SELECT * 
        FROM Parcial
        WHERE parcialId=:parcialId     """)
    fun buscar(parcialId: Int): Flow<Parcial1>

    @Query("""
        SELECT * 
        FROM Parcial
        ORDER BY parcialId """)
    fun getList(): Flow<List<Parcial1>>
}