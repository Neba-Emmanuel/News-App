package com.fuh.newsapp.data.remote.service

import com.fuh.newsapp.data.remote.dto.HeadlinesDTO

abstract class AbstractKtorService {
    abstract suspend fun getHeadLines(
        pageSize: Int,
        page: Int,
        country: String,
    ): HeadlinesDTO

}

