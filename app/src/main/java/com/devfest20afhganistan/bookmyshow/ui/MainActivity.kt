package com.devfest20afhganistan.bookmyshow.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.DefaultItemAnimator
import com.devfest20afhganistan.bookmyshow.R
import com.devfest20afhganistan.bookmyshow.model.Movie
import com.devfest20afhganistan.bookmyshow.model.MovieResponse
import com.devfest20afhganistan.bookmyshow.retrofit.RetrofitBuilder
import com.devfest20afhganistan.bookmyshow.ui.adapter.MoviesAdapter
import com.devfest20afhganistan.bookmyshow.utils.NetworkHelper
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    companion object {
        private const val API_KEY = "7bc0651fe0ea5973822df3bd27e779d9"
    }

    private lateinit var networkHelper: NetworkHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Fetch List of Movies
        fetchMovies()
    }

    private fun fetchMovies() {
        networkHelper = NetworkHelper(this)

        if (networkHelper.isNetworkConnected()) {
            showProgress()

            val request = RetrofitBuilder.buildService()
            val call = request.getMovies(API_KEY)

            call.enqueue(object : Callback<MovieResponse> {
                override fun onResponse(
                    call: Call<MovieResponse>,
                    response: Response<MovieResponse>
                ) {
                    hideProgress()
                    if (response.isSuccessful && response.body() != null) {
                        showMovies(response.body()!!.results)
                    } else {
                        showErrorMessage(getString(R.string.error_msg))
                    }
                }

                override fun onFailure(call: Call<MovieResponse>, throwable: Throwable) {
                    hideProgress()
                    showErrorMessage(throwable.message)
                }
            })
        } else {
            showErrorMessage(getString(R.string.no_internet))
        }
    }

    private fun showMovies(movies: List<Movie>) {
        recyclerView.visibility = View.VISIBLE
        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.adapter = MoviesAdapter(movies)
    }

    private fun showErrorMessage(errorMessage: String?) {
        errorView.visibility = View.VISIBLE
        errorView.text = errorMessage
    }

    private fun hideProgress() {
        progressBar.visibility = View.GONE
    }

    private fun showProgress() {
        progressBar.visibility = View.VISIBLE
    }
}