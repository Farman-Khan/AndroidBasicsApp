package com.bluetech.androidbasicapp.data.dto

import com.bluetech.androidbasicapp.domain.model.Article
import com.bluetech.androidbasicapp.domain.model.NewsArticle

data class NewsArticleDto(
    val status: String?,
    val totalResults: Int?,
    val articles: List<ArticleDto>?,
)

data class ArticleDto(
    val author: String?,
    val title: String,
    val description: String?,
    val url: String?,
    val urlToImage: String?,
    val publishedAt: String?,
)

fun NewsArticleDto.toNewsArticle(): NewsArticle {
    return NewsArticle(
        totalResults = this.totalResults ?: 0,
        articles = this.articles?.map {
            Article(
                author = it.author ?: "",
                title = it.title ?: "",
                description = it.description ?: "",
                url = it.url ?: ""
            )
        } ?: emptyList()
    )
}

