package com.bluetech.androidbasicapp.data.source

import com.bluetech.androidbasicapp.data.source.remote.retrofit.NetworkManager
import com.bluetech.androidbasicapp.data.source.remote.retrofit.NewsApi
import com.bluetech.androidbasicapp.domain.model.NewsArticle
import javax.inject.Inject


//TODO.. need to inject NewsApi too
class NewsRepository @Inject constructor(/*val api: NewsApi*/) {

    suspend fun getTopArticles(country: String): NewsArticle {
        return NetworkManager.getNewsApi().getTopArticles(country)
    }
}