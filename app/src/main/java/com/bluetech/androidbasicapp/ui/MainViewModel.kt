package com.bluetech.androidbasicapp.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bluetech.androidbasicapp.data.source.local.mock.getMockArticle
import com.bluetech.androidbasicapp.domain.model.UiState

class MainViewModel : ViewModel() {
    // LiveData to represent the UI state
    private val _uiState = MutableLiveData<UiState>()
    val uiState: LiveData<UiState> = _uiState

    init {
       getArticle()
    }

    private fun getArticle() {
        val response = getMockArticle()
        _uiState.value = UiState.Success(response.articles)
    }
}
