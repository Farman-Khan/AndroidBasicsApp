package com.bluetech.androidbasicapp.domain.model

sealed class UiState {
    object Loading : UiState()
    data class Success(val articles: List<Article>) : UiState()
    data class Error(val errorMessage: String) : UiState()
    object Empty : UiState()
}