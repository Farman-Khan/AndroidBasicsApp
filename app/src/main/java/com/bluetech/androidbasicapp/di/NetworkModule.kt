package com.bluetech.androidbasicapp.di

import com.bluetech.androidbasicapp.data.source.remote.retrofit.NetworkManager
import com.bluetech.androidbasicapp.data.source.remote.retrofit.NewsApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Provides
    fun providesNewsApi(): NewsApi {
        return NetworkManager().getNewsApi()
    }
}
