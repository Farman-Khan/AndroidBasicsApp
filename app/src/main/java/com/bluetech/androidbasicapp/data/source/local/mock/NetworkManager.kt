package com.bluetech.androidbasicapp.data.source.local.mock

import com.bluetech.androidbasicapp.domain.model.NewsArticle
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

object NetworkManager {
    private const val BASE_URL = "https://newsapi.org/"

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(CoroutineCallAdapterFactory())
        .build()

     val newsApiService: NewsApi? = retrofit.create(NewsApi::class.java)

   /* fun getApi() =
        Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(Api::class.java)*/
}


interface NewsApi {

    // https://newsapi.org/v2/top-headlines?country=us&apiKey=ee8cb583c73e439faade9115309bf5c2
    //@GET("/v2/top-headlines?q=John&apiKey=ee8cb583c73e439faade9115309bf5c2")
    @GET("v2/top-headlines")
    suspend fun getTopHeadlines(
        @Query("country") country: String,
        @Query("apiKey") apiKey: String
    ): NewsArticle
}