package com.bluetech.androidbasicapp.domain.repository

import com.bluetech.androidbasicapp.data.dto.NewsArticleDto
import com.bluetech.androidbasicapp.data.model.ArticlesDTO
import com.bluetech.androidbasicapp.domain.model.NewsArticle
import kotlinx.coroutines.flow.Flow

interface NewsRepository {
     suspend fun getTopArticles(country: String): ArticlesDTO
}
