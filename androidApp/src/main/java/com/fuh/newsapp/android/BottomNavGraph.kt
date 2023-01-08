package com.fuh.newsapp.android

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.fuh.newsapp.android.ui.home.Home
import com.fuh.newsapp.android.ui.readlater.ReadLaterScreen

@Composable
fun BottomNavGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = BottomBar.Home.route
    ){
        composable(route = BottomBar.Home.route){
            Home()
        }
        composable(route = BottomBar.ReadLater.route){
            ReadLaterScreen()
        }
    }
}