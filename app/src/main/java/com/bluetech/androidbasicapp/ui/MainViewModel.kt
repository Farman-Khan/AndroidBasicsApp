package com.bluetech.androidbasicapp.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bluetech.androidbasicapp.common.Resource
import com.bluetech.androidbasicapp.domain.model.NewsArticle
import com.bluetech.androidbasicapp.domain.repository.NewsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: NewsRepository
) : ViewModel() {
    private var _articleData = MutableStateFlow<Resource<NewsArticle>>(Resource.Loading())
    val articleData: StateFlow<Resource<NewsArticle>> = _articleData.asStateFlow()

    init {
        getArticle()
    }

    private fun getArticle() {
        viewModelScope.launch {
            _articleData.emit(Resource.Loading())
            repository.getTopArticles("us").collect { newsArticle ->
                if (newsArticle.articles.isNotEmpty()) {
                    val updatedNewsArticle = NewsArticle(
                        totalResults = newsArticle.totalResults,
                        articles = newsArticle.articles.filter { it.author.isNotBlank() }
                    )

                    _articleData.value = Resource.Success(data = updatedNewsArticle)
                } else {
                    _articleData.value = Resource.Error("There is no data")
                }
            }
            //logger.log(response.toString())
        }
    }
}
