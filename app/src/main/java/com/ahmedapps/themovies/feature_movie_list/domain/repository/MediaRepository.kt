package com.ahmedapps.themovies.feature_movie_list.domain.repository

import com.ahmedapps.themovies.util.Resource
import com.ahmedapps.themovies.feature_movie_list.domain.models.Media
import kotlinx.coroutines.flow.Flow

interface MediaRepository {

    suspend fun updateItem(media: Media)

    suspend fun insertItem(media: Media)

    suspend fun getItem(
        id: Int,
        type: String,
        category: String
    ): Media

    suspend fun getMoviesAndTvSeriesList(
        fetchFromRemote: Boolean,
        isRefresh: Boolean,
        type: String,
        category: String,
        page: Int,
        apiKey: String
    ): Flow<Resource<List<Media>>>

    suspend fun getTrendingList(
        fetchFromRemote: Boolean,
        isRefresh: Boolean,
        type: String,
        time: String,
        page: Int,
        apiKey: String
    ): Flow<Resource<List<Media>>>

    suspend fun getSearchList(
        fetchFromRemote: Boolean,
        query: String,
        page: Int,
        apiKey: String
    ): Flow<Resource<List<Media>>>

}










