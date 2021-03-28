package com.bersyte.retrofitcourseyt

import com.bersyte.retrofitcourseyt.Constants.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
/**
 * By:Isaias Cuvula
 * Check Out My Youtube Channel (bersyte technology)
 * Subscribe & leave your feedback
 */
object RetrofitInstance {


    val retrofit: PostApi by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(PostApi::class.java)
    }

}