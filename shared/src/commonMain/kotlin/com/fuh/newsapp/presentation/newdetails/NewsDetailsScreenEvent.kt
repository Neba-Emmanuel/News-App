package com.fuh.newsapp.presentation.newdetails

import com.fuh.newsapp.domain.domain_model.HeadlineDomainModel

sealed interface NewsDetailsScreenEvent{

    data class SaveForLater(val headlineDomainModel: HeadlineDomainModel) : NewsDetailsScreenEvent

}