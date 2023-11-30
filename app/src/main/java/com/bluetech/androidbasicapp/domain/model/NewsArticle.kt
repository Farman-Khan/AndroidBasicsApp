package com.bluetech.androidbasicapp.domain.model

data class NewsArticle(
    val totalResults: Int,
    val articles: List<Article>,
)

data class Article(
    val author: String,
    val title: String,
    val description: String,
    val url: String,
)
