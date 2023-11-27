package com.bluetech.androidbasicapp.data.repository

import com.bluetech.androidbasicapp.data.dto.toNewsArticle
import com.bluetech.androidbasicapp.data.source.remote.retrofit.NewsApi
import com.bluetech.androidbasicapp.domain.model.NewsArticle
import com.bluetech.androidbasicapp.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

 class NewsRepositoryImpl @Inject constructor(private val newsApi: NewsApi) : NewsRepository {
     override suspend fun getTopArticles(country: String): Flow<NewsArticle> = flow {
         val newsArticleDto = newsApi.getTopArticles(country)
         if (newsArticleDto.articles?.isNotEmpty() == true) {
             emit(newsArticleDto.toNewsArticle())
         } else {
             emit(NewsArticle(totalResults = 0, articles = emptyList()))
         }
     }
}
