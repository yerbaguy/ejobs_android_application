package com.ebartmedia.ejobs.Retrofit

import com.ebartmedia.ejobs.Model.Categories
import retrofit2.http.GET
import java.util.*
import io.reactivex.Observable

interface IMyAPI {


    @get:GET("api/categories")
    val categories:Observable<List<Categories>>


//    @get:GET("api/info")
//    val categories:Observable<List<Categories>>

//    @GET("api/categories")
//    fun getCategories():Observable<CategoriesResponse>
}