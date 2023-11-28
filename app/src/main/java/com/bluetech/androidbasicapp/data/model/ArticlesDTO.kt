package com.bluetech.androidbasicapp.data.model

import com.bluetech.androidbasicapp.domain.model.Article

data class ArticlesDTO(
    val articles: List<ArticleDTO>,
    val status: String,
    val totalResults: Int
)


