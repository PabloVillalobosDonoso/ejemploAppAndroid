package com.pedroesparrago.androidmastercurso.superheroapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("/api/487f7b22f68312d2c1bbc93b1aea445b/search/{name}")
    suspend fun getSuperheroes(@Path("name") superoheroName:String):Response<SuperheroDataResponse>

    @GET("/api/487f7b22f68312d2c1bbc93b1aea445b/{id}")
    suspend fun getSuperherodetail(@Path("id") supegeroId:String):Response<SuperheroDetailResponse>
}