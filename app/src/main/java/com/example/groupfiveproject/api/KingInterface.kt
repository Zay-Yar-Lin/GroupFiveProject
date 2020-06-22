package com.example.groupfiveproject.api

import com.example.groupfiveproject.model.ApiKing
import com.example.groupfiveproject.model.ApiKingItem
import com.example.groupfiveproject.model.kingVote
import retrofit2.Call
import retrofit2.http.GET

interface KingInterface {
    @GET("king")
    fun getkings(): Call<ApiKingItem>

    @GET("queen")
    fun getqueens(): Call<ApiKingItem>

}