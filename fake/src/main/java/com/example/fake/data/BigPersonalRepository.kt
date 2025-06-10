package com.example.fake.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class BigPersonalRepository {
    private val BASE_URL = "https://jsonplaceholder.typicode.com/"

    val instance: RetrofitApi by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(RetrofitApi::class.java)
    }

    suspend fun getPeronalInfo(id: Int): UserData {
        return instance.getUser(id)
    }
}