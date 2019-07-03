package com.ilkeryildirim.firstkotlin.Api

import com.ilkeryildirim.firstkotlin.Const
import com.ilkeryildirim.firstkotlin.Model.Marvel
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

class RetrofitClient {

    companion object {

        fun getClient():Retrofit {
            return Retrofit.Builder()
                .baseUrl(Const.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }

}

interface MarvelApiService{

    @GET("marvel")
    fun getHeroes(): Call<List<Marvel>>

}



