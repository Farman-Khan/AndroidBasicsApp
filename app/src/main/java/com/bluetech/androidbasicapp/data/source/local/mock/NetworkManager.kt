package com.bluetech.androidbasicapp.data.source.local.mock

import com.bluetech.androidbasicapp.domain.model.NewsArticle
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

object NetworkManager {
    private const val BASE_URL = "https://newsapi.org"

    fun getApi() =
        Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(Api::class.java)
}


interface Api {

    // https://newsapi.org/v2/top-headlines?country=us&apiKey=ee8cb583c73e439faade9115309bf5c2
    @GET("/v2/top-headlines?country=us&apiKey=ee8cb583c73e439faade9115309bf5c2")
    fun getTopHeadlines(): Call<NewsArticle>
}