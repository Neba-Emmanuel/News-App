package com.fuh.newsapp.presentation.readlater

import com.fuh.newsapp.domain.usecase.readlater.GetReadLaterUseCase
import com.fuh.newsapp.domain.util.Result
import com.fuh.newsapp.domain.util.asResult
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn

class ReadLaterViewModel(private val getReadLaterUseCase: GetReadLaterUseCase) : ViewModel() {

    val state = readLaterStream().stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5_000),
        initialValue = ReadLaterState.Loading
    )

   private fun readLaterStream(): Flow<ReadLaterState> = getReadLaterUseCase().asResult().map { result ->
        when (result) {
            is Result.Error -> {
                ReadLaterState.Error(result.exception.message)
            }
            Result.Idle -> {
                ReadLaterState.Loading
            }
            Result.Loading -> {
                ReadLaterState.Loading
            }
            is Result.Success -> {
                ReadLaterState.Success(result.data)
            }
        }
    }
}