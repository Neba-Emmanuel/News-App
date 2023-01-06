package com.fuh.newsapp.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.fuh.newsapp.android.ui.NavGraphs
import com.fuh.newsapp.android.ui.theme.NewsAppTheme
import com.ramcosta.composedestinations.DestinationsNavHost


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            NewsAppTheme {


               DestinationsNavHost(navGraph = NavGraphs.root)

            }
        }


    }
}

