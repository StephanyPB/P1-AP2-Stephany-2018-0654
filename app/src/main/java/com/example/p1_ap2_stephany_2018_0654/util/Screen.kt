package com.example.p1_ap2_stephany_2018_0654.util

sealed class Screen(val route: String) {
    object RegistroParcialScreen: Screen("RegistroParcial")

    object ConsutaParcialScreen: Screen("ConsutaParcial")

}