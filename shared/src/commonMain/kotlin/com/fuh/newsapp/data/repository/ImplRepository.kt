package com.fuh.newsapp.data.repository

import com.fuh.newsapp.data.local.dao.HeadlineDAO
import com.fuh.newsapp.data.local.service.AbstractRealmService
import com.fuh.newsapp.data.remote.service.AbstractKtorService


class ImplRepository(
    private val ktorService: AbstractKtorService,
    private val realmService: AbstractRealmService
) : AbstractRepository() {


    override suspend fun getAllHeadlines(
        page: Int,
        pageSize: Int,
        country: String
    ) = ktorService.getHeadLines(
        pageSize = pageSize,
        page = page,
        country = country

    )

    override suspend fun addToReadLater(headlineDAO: HeadlineDAO) {
        realmService.addToReadLater(headlineDAO)
    }

    override suspend fun getAllReadLater() = realmService.getReadLater()

}




