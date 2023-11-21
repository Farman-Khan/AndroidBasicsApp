package com.bluetech.androidbasicapp.data.source.remote.retrofit

import com.bluetech.androidbasicapp.BuildConfig
import com.bluetech.androidbasicapp.domain.model.NewsArticle
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

object NetworkManager {
    private const val BASE_URL = "https://newsapi.org/"

    private val  newsInterceptor = Interceptor { chain ->
        val request = chain.request()

        //created/updated new url from the existing url in the request
        val url = request
            .url
            .newBuilder()
            .addQueryParameter("apiKey", BuildConfig.apiKey).build()
        //creating new request with newly created url
        val newRequest = request.newBuilder().url(url).build()

        chain.proceed(newRequest)
    }

   private val loggingInterceptor = HttpLoggingInterceptor().apply {
        this.level = if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY
        else HttpLoggingInterceptor.Level.NONE
    }

    private val newsClient = OkHttpClient
        .Builder()
        .addInterceptor(newsInterceptor)
        .addInterceptor(loggingInterceptor)
        .build()

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(newsClient)
        .build()

    fun getNewsApi() = retrofit.create(NewsApi::class.java)
}

interface NewsApi {
    @GET("v2/top-headlines")
    suspend fun getTopArticles(
        @Query("country") country: String,
    ): NewsArticle
}
