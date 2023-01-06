package com.fuh.newsapp.android

import android.app.Application
import com.fuh.newsapp.domain.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module


class NewsApp : Application(){

    override fun onCreate() {
        super.onCreate()

        initKoin(baseUrl = "https://newsapi.org/v2/", enableNetworkLogs = BuildConfig.DEBUG) {
            androidContext(this@NewsApp)
            // androidLogger(if (BuildConfig.DEBUG) Level.ERROR else Level.INFO)
            modules(
                listOf(module {
                    /**
                     * android specific modules
                     */
                })
            )
        }
    }
}