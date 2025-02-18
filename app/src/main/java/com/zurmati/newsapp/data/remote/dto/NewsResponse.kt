package com.zurmati.newsapp.data.remote.dto

import com.zurmati.newsapp.domain.model.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)