package com.example.p1_ap2_stephany_2018_0654.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.p1_ap2_stephany_2018_0654.model.Parcial1

@Database(
    entities = [
        Parcial1::class
    ],
    exportSchema = false,
    version = 1
)
abstract class Parcial1Db : RoomDatabase() {
    abstract val parcial1Dao: Parcial1Dao
}