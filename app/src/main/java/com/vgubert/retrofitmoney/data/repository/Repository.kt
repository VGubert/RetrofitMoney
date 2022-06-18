package com.vgubert.retrofitmoney.data.repository

import com.vgubert.retrofitmoney.data.api.RetrofitInstance
import com.vgubert.retrofitmoney.model.beznal.BeznalItem
import com.vgubert.retrofitmoney.model.nal.NalichkaItem
import retrofit2.Response

class Repository {
    suspend fun getNal(): Response<NalichkaItem> {
        return RetrofitInstance.api.getNalMoneys()
    }

    suspend fun getBeznal(): Response<BeznalItem> {
        return RetrofitInstance.api.getBeznalMoneys()
    }
}