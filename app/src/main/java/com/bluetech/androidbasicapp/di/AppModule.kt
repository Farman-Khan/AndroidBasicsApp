package com.bluetech.androidbasicapp.di

import com.bluetech.androidbasicapp.data.repository.NewsRepositoryImpl
import com.bluetech.androidbasicapp.domain.repository.NewsRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
 abstract class AppModule {

    @Binds
    abstract fun provideNewsRepository(repository: NewsRepositoryImpl): NewsRepository

    //Better to use @Binds instead of @Provides in case of interface
   /* @Provides
    fun provideNewsRepository(): NewsRepository {
        return NewsRepositoryImpl()
    }
    */

}