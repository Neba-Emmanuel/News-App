package com.fuh.newsapp.domain.usecase.readlater

import com.fuh.newsapp.data.local.dao.asDomainModel
import com.fuh.newsapp.data.repository.AbstractRepository
import kotlinx.coroutines.flow.flow

class GetReadLaterUseCase(private val repository: AbstractRepository) {

    operator fun invoke() = flow {
        val response = repository.getAllReadLater().asDomainModel()

        emit(response)
    }
}