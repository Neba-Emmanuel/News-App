package com.fuh.newsapp.data.remote.service

import com.fuh.newsapp.data.remote.dto.HeadlinesDTO
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*

class ImplKtorService(
    private val httpClient: HttpClient,
    private val baseUrl: String
) : AbstractKtorService() {

    private val apikey = "5a5a5bc3bb6f479c9550681ef42d8314"
    override suspend fun getHeadLines(
        pageSize: Int,
        page: Int,
        country: String,

    ): HeadlinesDTO = httpClient.get("$baseUrl/${EndPoints.HEADLINES}") {
        header("x-api-key", apikey)
        parameter("country", country)
        parameter("pageSize", pageSize)
        parameter("page", page)
    }.body()

    }

