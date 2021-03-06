package com.example.p1_ap2_stephany_2018_0654.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "Prestamos")
@Parcelize
data class Prestamo(
    @PrimaryKey(autoGenerate = true)
    val prestamoId: Int=0,
    val deudor: String,
    val concepto: String ="",
    val monto: Float = 0f

): Parcelable

