package com.fuh.newsapp.presentation.home

import com.fuh.newsapp.domain.domain_model.HeadlineDomainModel


sealed interface HomeScreenState{

    object Loading: HomeScreenState

    object Idle : HomeScreenState

    data class Success(val headlines: List<HeadlineDomainModel>) : HomeScreenState

    data class Error(val errorMessage: String) : HomeScreenState



}

