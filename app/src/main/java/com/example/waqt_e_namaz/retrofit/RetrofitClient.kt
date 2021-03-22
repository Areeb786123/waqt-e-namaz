package com.example.waqt_e_namaz.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private var retrofit:Retrofit?=null

    fun getClient(baseurl:String):Retrofit{
        if(retrofit ==null){
            retrofit=Retrofit.Builder()
                .baseUrl(baseurl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit!!
    }

}