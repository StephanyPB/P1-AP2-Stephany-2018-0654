package com.example.p1_ap2_stephany_2018_0654

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.p1_ap2_stephany_2018_0654.ui.components.prestamo.*
import com.example.p1_ap2_stephany_2018_0654.ui.components.prestamo.RegistroPrestamoScreen
import com.example.p1_ap2_stephany_2018_0654.ui.theme.P1AP2Stephany20180654Theme
import com.example.p1_ap2_stephany_2018_0654.util.Screen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                    MyApps()
                }
            }
        }
@Composable
fun MyApps() {
    P1AP2Stephany20180654Theme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            val navHostController = rememberNavController()

            NavHost(navController = navHostController, startDestination = "ConsultaPrestamo") {
                composable("ConsultaPrestamo") {
                    ConsutaPrestamoScreen(navHostController = navHostController)
                }
                composable("RegistroPrestamo") {
                    RegistroPrestamoScreen(navHostController = navHostController)
                }

            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    P1AP2Stephany20180654Theme {
        MyApps()
    }
}