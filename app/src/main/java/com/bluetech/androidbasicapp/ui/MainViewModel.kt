package com.bluetech.androidbasicapp.ui

import android.os.Build
import androidx.annotation.RequiresExtension
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bluetech.androidbasicapp.common.Resource
import com.bluetech.androidbasicapp.domain.model.ArticleState
import com.bluetech.androidbasicapp.domain.use_case.GetArticleListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
@HiltViewModel
class MainViewModel@Inject constructor(
    private val getArticleListUseCase: GetArticleListUseCase
) : ViewModel() {
    private var _articleData = MutableStateFlow(ArticleState())
    val articleData: StateFlow<ArticleState> = _articleData.asStateFlow()

    @RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
     fun getArticle(country: String) {
        getArticleListUseCase(country).onEach {
            when(it) {
                is Resource.Loading -> {
                    _articleData.value = ArticleState(isLoading = true)
                }
                is Resource.Success -> {
                    val validAuthor = it.data?.filter { it.author.isNullOrEmpty().not() }
                    _articleData.value = ArticleState(data = validAuthor)
                }
                is Resource.Error -> {
                    _articleData.value = ArticleState(error = it.message ?: "")
                }
            }
        }.launchIn(viewModelScope)
    }
}
