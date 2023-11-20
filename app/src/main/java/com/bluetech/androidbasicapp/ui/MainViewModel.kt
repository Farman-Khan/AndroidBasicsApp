package com.bluetech.androidbasicapp.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bluetech.androidbasicapp.data.source.local.mock.NetworkManager
import com.bluetech.androidbasicapp.domain.model.NewsArticle
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private var _articleData = MutableLiveData<NewsArticle>()
    val articleData: LiveData<NewsArticle> = _articleData

    init {
       getArticle()
    }

    private fun getArticle() {
        viewModelScope.launch {
            // val response = getMockArticle()
            val response = NetworkManager.getApi().getTopHeadlines()
            _articleData.value = response
        }
    }
}
