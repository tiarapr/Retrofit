package com.example.retrofit.POJO

import com.google.gson.annotations.SerializedName

class Upcoming {
    @SerializedName("results")
    var data: List<UpcomingData>? = null

    inner class UpcomingData{

        @SerializedName("vote_count")
        val vote_count: Int? = null

        @SerializedName("id")
        val idMovie: Int? = null

        @SerializedName("vote_avarage")
        val vote_avarage: Double? = null

        @SerializedName("title")
        val movieTitle: String? = null

        @SerializedName("popularity")
        val popularity: Double? = null

        @SerializedName("poster_path")
        val poster_path: String? = null

        @SerializedName("backdrop_path")
        val backdrop_path: String? = null

        @SerializedName("overview")
        val overview: String? = null

        @SerializedName("release_date")
        val release_date: String? = null
    }
}