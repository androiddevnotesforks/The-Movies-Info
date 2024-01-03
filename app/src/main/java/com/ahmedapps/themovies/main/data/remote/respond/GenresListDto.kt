package com.ahmedapps.themovies.main.data.remote.respond

import com.ahmedapps.themovies.main.domain.models.Genre

data class GenresListDto(
    val genres: List<Genre>
)