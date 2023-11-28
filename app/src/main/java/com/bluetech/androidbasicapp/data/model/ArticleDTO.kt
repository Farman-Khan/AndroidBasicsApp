package com.bluetech.androidbasicapp.data.model

import com.bluetech.androidbasicapp.domain.model.Article

data class ArticleDTO(
    val author: String?,
    val content: String?,
    val description: String?,
    val publishedAt: String?,
    val title: String?,
    val url: String?,
    val urlToImage: String?
)

fun ArticleDTO.toDomainArticle(): Article {
    return Article(
        author = this.author ?: "",
        title = this.title ?: "",
        description = this.description ?: "",
        url = this.url ?: ""
    )
}