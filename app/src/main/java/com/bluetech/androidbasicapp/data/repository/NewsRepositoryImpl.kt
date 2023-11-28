package com.bluetech.androidbasicapp.data.repository

import com.bluetech.androidbasicapp.data.model.ArticlesDTO
import com.bluetech.androidbasicapp.data.source.remote.retrofit.NewsApi
import com.bluetech.androidbasicapp.domain.repository.NewsRepository
import javax.inject.Inject

 class NewsRepositoryImpl @Inject constructor(private val newsApi: NewsApi) : NewsRepository {
     override suspend fun getTopArticles(country: String): ArticlesDTO {
         return newsApi.getCountryArticles(country = country)
     }
}
