package com.bluetech.androidbasicapp.di

import com.bluetech.androidbasicapp.BuildConfig
import com.bluetech.androidbasicapp.common.Utils.BASE_URL
import com.bluetech.androidbasicapp.data.source.remote.retrofit.NewsApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

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

    private  val newsClient = OkHttpClient
        .Builder()
        .addInterceptor(newsInterceptor)
        .addInterceptor(loggingInterceptor)
        .build()

    @Provides
    fun providesNewsApi(): NewsApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(newsClient)
            .build().create(NewsApi::class.java)
    }
}
