package com.fuh.newsapp.presentation.readlater

import com.fuh.newsapp.domain.domain_model.HeadlineDomainModel

public sealed interface ReadLaterState {
    object Loading : ReadLaterState
    data class Error(val message: String) : ReadLaterState
    data class Success(val headlines: List<HeadlineDomainModel>) : ReadLaterState
}