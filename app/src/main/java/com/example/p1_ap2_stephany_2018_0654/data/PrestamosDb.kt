package com.example.p1_ap2_stephany_2018_0654.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.p1_ap2_stephany_2018_0654.model.Prestamo

@Database(
    entities = [
        Prestamo::class
    ],
    exportSchema = false,
    version = 2
)
abstract class PrestamosDb : RoomDatabase() {
    abstract val prestamoDao: PrestamoDao
}