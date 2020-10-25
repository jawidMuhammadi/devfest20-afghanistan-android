package com.devfest20afhganistan.bookmyshow.retrofit

import com.devfest20afhganistan.bookmyshow.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Ahmad Jawid Muhammadi
 * on 25-10-2020.
 */

interface MovieService {
    @GET("discover/movie")
    fun getMovies(@Query("api_key") key: String): Call<MovieResponse>
}