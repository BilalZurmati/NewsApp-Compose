package com.zurmati.newsapp.presentation.favourite

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zurmati.newsapp.domain.usecases.news.GetSavedArticles
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class FavouriteViewModel @Inject constructor(
    private val getSavedArticlesUseCase: GetSavedArticles
) : ViewModel() {

    private val _state = mutableStateOf(FavouriteState())
    val state: State<FavouriteState> = _state

    init {
        getArticles()
    }

    private fun getArticles() {
        getSavedArticlesUseCase().onEach {
            _state.value = _state.value.copy(articles = it)
        }.launchIn(viewModelScope)
    }
}