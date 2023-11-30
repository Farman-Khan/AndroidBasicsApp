package com.bluetech.androidbasicapp.data.repository

import com.bluetech.androidbasicapp.data.dto.toNewsArticle
import com.bluetech.androidbasicapp.data.source.remote.retrofit.NewsApi
import com.bluetech.androidbasicapp.domain.model.NewsArticle
import com.bluetech.androidbasicapp.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject


 class NewsRepositoryImpl @Inject constructor(val api: NewsApi) : NewsRepository {

     /* override suspend fun getTopArticles(country: String): NewsArticle {
        //val api = NetworkManager.getNewsApi()
        val newsArticleDto = api.getTopArticles(country)
        return newsArticleDto.toNewsArticle()
    }*/

     override suspend fun getTopArticles(country: String): Flow<NewsArticle> = flow {
         //val api = NetworkManager.getNewsApi()
         val newsArticleDto = api.getTopArticles(country)
         emit(newsArticleDto.toNewsArticle())
     }
}
