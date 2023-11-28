package com.bluetech.androidbasicapp.domain.model

data class ArticleState(
    val data: List<Article>? = null,
    val error: String? = null,
    val isLoading: Boolean = false
)
