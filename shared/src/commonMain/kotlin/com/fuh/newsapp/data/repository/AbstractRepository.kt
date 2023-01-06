package com.fuh.newsapp.data.repository

import com.fuh.newsapp.data.local.dao.HeadlineDAO
import com.fuh.newsapp.data.remote.dto.HeadlinesDTO


abstract class AbstractRepository {



    abstract suspend fun getAllHeadlines(
        page: Int,
        pageSize: Int,
        country: String
    ): HeadlinesDTO

    abstract suspend fun addToReadLater(headlineDAO: HeadlineDAO)
    abstract suspend fun getAllReadLater(): List<HeadlineDAO>
}