package com.bluetech.androidbasicapp.domain.use_case

import android.net.http.HttpException
import android.os.Build
import androidx.annotation.RequiresExtension
import com.bluetech.androidbasicapp.common.Resource
import com.bluetech.androidbasicapp.data.model.toDomainArticle
import com.bluetech.androidbasicapp.domain.model.Article
import com.bluetech.androidbasicapp.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException
import javax.inject.Inject

class GetArticleListUseCase @Inject constructor(private val repository: NewsRepository) {
    @RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
    operator fun invoke(country: String): Flow<Resource<List<Article>>> = flow {
        try {
            emit(Resource.Loading())
            val response = repository.getTopArticles(country)
            val articleList = response.articles.map { it.toDomainArticle() }
            val isEmpty = articleList.isEmpty()
            emit(Resource.Success(data = if (isEmpty) emptyList() else articleList))
        } catch (e: HttpException) {
            emit(Resource.Error(message = e.localizedMessage ?: "Unknown Error"))
        } catch (e: IOException) {
            emit(Resource.Error(message = e.localizedMessage ?: "Check your internet connection"))
        } catch (e: Exception) {

        }
    }
}