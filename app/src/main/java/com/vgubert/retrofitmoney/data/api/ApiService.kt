package com.vgubert.retrofitmoney.data.api

import com.vgubert.retrofitmoney.model.beznal.Beznal
import com.vgubert.retrofitmoney.model.beznal.BeznalItem
import com.vgubert.retrofitmoney.model.nal.Nalichka
import com.vgubert.retrofitmoney.model.nal.NalichkaItem
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("p24api/pubinfo?json&exchange&coursid=5")
    suspend fun getNalMoneys(): Response<Nalichka>

    @GET("p24api/pubinfo?exchange&json&coursid=11")
    suspend fun getBeznalMoneys(): Response<Beznal>
}