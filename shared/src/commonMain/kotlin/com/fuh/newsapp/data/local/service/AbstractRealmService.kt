package com.fuh.newsapp.data.local.service

import com.fuh.newsapp.data.local.dao.HeadlineDAO

abstract class AbstractRealmService{
    abstract suspend fun addToReadLater(headlineDAO: HeadlineDAO)

    abstract suspend fun getReadLater(): List<HeadlineDAO>
}