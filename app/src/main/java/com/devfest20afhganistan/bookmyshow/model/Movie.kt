package com.devfest20afhganistan.bookmyshow.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Ahmad Jawid Muhammadi
 * on 25-10-2020.
 */

data class Movie(
    val id: Int,

    @SerializedName("poster_path")
    val posterPath: String,

    @SerializedName("release_date")
    val releaseDate: String,

    val title: String,

    @SerializedName("vote_average")
    val voteAverage: Double,

    @SerializedName("vote_count")
    val voteCount: Int
)