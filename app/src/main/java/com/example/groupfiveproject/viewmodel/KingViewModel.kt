package com.example.groupfiveproject.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.groupfiveproject.model.ApiKingItem
import javax.security.auth.callback.Callback
class KingViewModel {
    var kings = MutableLiveData<List<ApiKingItem>> = MutableLiveData()

    fun getResult():LiveData<List<ApiKingItem>> = kings

    private val kingApi: KingApi = KingApi()

    fun loadResult(){
        val apiCall = kingApi.getKing()
        apiCall.enqueue(object :Callback<ApiKingItem>{

        })
    }
}