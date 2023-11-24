package com.bluetech.androidbasicapp.domain.repository

import com.bluetech.androidbasicapp.domain.model.NewsArticle

interface NewsRepository {
     suspend fun getTopArticles(country: String): NewsArticle
}
