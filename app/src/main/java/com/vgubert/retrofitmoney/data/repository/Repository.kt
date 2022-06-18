package com.vgubert.retrofitmoney.data.repository

import com.vgubert.retrofitmoney.data.api.RetrofitInstance
import com.vgubert.retrofitmoney.model.beznal.Beznal
import com.vgubert.retrofitmoney.model.beznal.BeznalItem
import com.vgubert.retrofitmoney.model.nal.Nalichka
import com.vgubert.retrofitmoney.model.nal.NalichkaItem
import retrofit2.Response

class Repository {
    suspend fun getNal(): Response<Nalichka> {
        return RetrofitInstance.api.getNalMoneys()
    }

    suspend fun getBeznal(): Response<Beznal> {
        return RetrofitInstance.api.getBeznalMoneys()
    }
}