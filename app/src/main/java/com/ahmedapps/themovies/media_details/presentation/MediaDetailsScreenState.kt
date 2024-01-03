package com.ahmedapps.themovies.media_details.presentation

import com.ahmedapps.themovies.main.domain.models.Genre
import com.ahmedapps.themovies.main.domain.models.Media


data class MediaDetailsScreenState(

    var isLoading: Boolean = false,

    var media: Media? = null,
    var currentMovieId: Int = 0,
    var videoToPlay: String = "",

    var similarMediaList: List<Media> = emptyList(),
    var videosList: List<String> = emptyList(),
    var moviesGenresList: List<Genre> = emptyList(),
    var tvGenresList: List<Genre> = emptyList()

)