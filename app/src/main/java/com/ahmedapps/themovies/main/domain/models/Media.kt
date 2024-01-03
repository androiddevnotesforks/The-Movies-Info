package com.ahmedapps.themovies.main.domain.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Media(
    val adult: Boolean,
    val backdrop_path: String,
    val genre_ids: List<Int>,
    val id: Int,
    val media_type: String,
    val origin_country: List<String>,
    val original_language: String,
    val original_title: String,
    val overview: String,
    val popularity: Double,
    val poster_path: String,
    val release_date: String,
    val title: String,
    val vote_average: Double,
    val vote_count: Int,
    var category: String,
    var runtime: Int?,
    var status: String?,
    var tagline: String?,
    val videos: List<String>?,
//    val cast: Cast?,
    var similarMediaList: List<Int>,
) : Parcelable