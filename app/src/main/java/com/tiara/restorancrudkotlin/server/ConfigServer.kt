package com.tiara.restorancrudkotlin.server

import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit



class ConfigServer {

    var retrofit = Retrofit.Builder()
            .baseUrl("https://www.googleapis.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    var service = retrofit.create<ApiService>(ApiService::class.java!!)
}