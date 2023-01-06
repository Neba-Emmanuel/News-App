package com.fuh.newsapp.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.fuh.newsapp.android.ui.NavGraphs
import com.fuh.newsapp.android.ui.theme.KMMNewsTheme
import com.ramcosta.composedestinations.DestinationsNavHost


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            KMMNewsTheme {


               DestinationsNavHost(navGraph = NavGraphs.root)

            }
        }


    }
}

