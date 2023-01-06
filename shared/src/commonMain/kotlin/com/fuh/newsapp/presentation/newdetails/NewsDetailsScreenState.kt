package com.fuh.newsapp.presentation.newdetails

sealed interface NewsDetailsScreenState {
    object Idle : NewsDetailsScreenState
    object SavingForLater : NewsDetailsScreenState
    object Success : NewsDetailsScreenState
}