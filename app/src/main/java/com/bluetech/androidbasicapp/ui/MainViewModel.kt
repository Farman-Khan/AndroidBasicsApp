package com.bluetech.androidbasicapp.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bluetech.androidbasicapp.data.source.local.mock.getMockArticle
import com.bluetech.androidbasicapp.domain.model.NewsArticle

class MainViewModel : ViewModel() {
    private var _articleData = MutableLiveData<NewsArticle>()
    val articleData: LiveData<NewsArticle> = _articleData

    init {
       getArticle()
    }

    private fun getArticle() {
        val response = getMockArticle()
        _articleData.value = response
    }
}
