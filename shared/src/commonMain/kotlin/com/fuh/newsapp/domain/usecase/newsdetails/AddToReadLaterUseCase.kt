package com.fuh.newsapp.domain.usecase.newsdetails

import com.fuh.newsapp.data.repository.AbstractRepository
import com.fuh.newsapp.domain.domain_model.HeadlineDomainModel
import com.fuh.newsapp.domain.domain_model.asDao

class AddToReadLaterUseCase(private val abstractRepository: AbstractRepository) {

    suspend operator fun invoke(headlineDomainModel: HeadlineDomainModel) {
        abstractRepository.addToReadLater(headlineDomainModel.asDao())
    }
}