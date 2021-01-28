package com.oliverworks.myapp.data.pojo.moviesDetails

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "movie_details")
class MovieDetails(

    @SerializedName("adult")
    var adult: Boolean = false,

    @SerializedName("backdrop_path")
    var backdropPath: String = "",

    @SerializedName("budget")
    var budget: Int = 0,

    /*@Embedded
    @SerializedName("genres")
    var genres: List<Genre> = emptyList(),*/

    @SerializedName("homepage")
    var homepage: String = "",

    @PrimaryKey
    @SerializedName("id")
    var id: Int = 0,

    @SerializedName("imdb_id")
    var imdbId: String = "",

    @SerializedName("original_language")
    var originalLanguage: String = "",

    @SerializedName("original_title")
    var originalTitle: String = "",

    @SerializedName("overview")
    var overview: String = "",

    @SerializedName("popularity")
    var popularity: Double = 0.0,

    @SerializedName("poster_path")
    var posterPath: String = "",

    @SerializedName("release_date")
    var releaseDate: String = "",

    @SerializedName("revenue")
    var revenue: Int = 0,

    @SerializedName("runtime")
    var runtime: Int = 0,
    @SerializedName("status")
    var status: String = "",

    @SerializedName("tagline")
    var tagline: String = "",

    @SerializedName("title")
    var title: String = "",

    @SerializedName("video")
    var video: Boolean = false,

    @SerializedName("vote_average")
    var voteAverage: Double = 0.0,

    @SerializedName("vote_count")
    var voteCount: Int = 0
) : Parcelable {
    fun getImageSizePoster500() = "https://image.tmdb.org/t/p/w500${this.posterPath}"
    fun getImageSizeBackdrop500() = "https://image.tmdb.org/t/p/w500${this.backdropPath}"
    fun getImageSizeBackdrop300() = "https://image.tmdb.org/t/p/w300${this.backdropPath}"
    fun getImageSizePoster300() = "https://image.tmdb.org/t/p/w300${this.posterPath}"
    fun getImageSize185() = "https://image.tmdb.org/t/p/w185${this.backdropPath}"
}