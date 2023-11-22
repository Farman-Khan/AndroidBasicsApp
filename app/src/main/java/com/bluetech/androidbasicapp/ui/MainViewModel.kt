package com.bluetech.androidbasicapp.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bluetech.androidbasicapp.data.source.NewsRepository
import com.bluetech.androidbasicapp.domain.model.NewsArticle
import kotlinx.coroutines.launch
import javax.inject.Inject


class MainViewModel @Inject constructor(val repository: NewsRepository ) : ViewModel() {
    private var _articleData = MutableLiveData<NewsArticle>()
    val articleData: LiveData<NewsArticle> = _articleData

    init {
       getArticle()
    }

    private fun getArticle() {
        viewModelScope.launch {
            // val response = getMockArticle()
            val response = repository.getTopArticles("us")

            //logger.log(response.toString())
            _articleData.value = response
        }
    }
}
