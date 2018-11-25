package com.example.adrey.mvvmposts.network

import com.example.adrey.mvvmposts.model.Post
import io.reactivex.Observable
import retrofit2.http.GET

interface PostApi {

    @GET("/posts")
    fun getPosts(): Observable<List<Post>>
}