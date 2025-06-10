package com.example.fake.data

import retrofit2.http.GET
import retrofit2.http.Path

interface RetrofitApi {
    @GET("users/{id}")
    suspend fun getUser(@Path("id") id: Int): UserData
}