package com.zurmati.newsapp.domain.usecases.news

import com.zurmati.newsapp.data.local.NewsDao
import com.zurmati.newsapp.domain.model.Article
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetSavedArticles @Inject constructor(
    private val newsDao: NewsDao
) {

    operator fun invoke(): Flow<List<Article>>{
        return newsDao.getArticles()
    }

}