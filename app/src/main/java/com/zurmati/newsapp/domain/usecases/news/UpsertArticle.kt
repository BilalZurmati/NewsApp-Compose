package com.zurmati.newsapp.domain.usecases.news

import com.zurmati.newsapp.data.local.NewsDao
import com.zurmati.newsapp.domain.model.Article
import javax.inject.Inject

class UpsertArticle @Inject constructor(
    private val newsDao: NewsDao
) {

    suspend operator fun invoke(article: Article){
        newsDao.upsert(article = article)
    }

}