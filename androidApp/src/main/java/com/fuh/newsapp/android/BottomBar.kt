package com.fuh.newsapp.android

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBar(
    val route: String,
    val title: String,
    val icon: ImageVector
){
    object  Home : BottomBar(
        route = "home",
        title = "Home",
        icon = Icons.Default.Home
    )
    object  ReadLater : BottomBar(
        route = "readlater",
        title = "saved",
        icon = Icons.Default.ShoppingCart
    )
}
