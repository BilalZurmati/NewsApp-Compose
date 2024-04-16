package com.zurmati.newsapp.presentation.favourite

import com.zurmati.newsapp.domain.model.Article

data class FavouriteState(
    val articles: List<Article> = emptyList()
)