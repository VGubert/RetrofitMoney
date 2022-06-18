package com.vgubert.retrofitmoney.screens.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vgubert.retrofitmoney.data.repository.Repository
import com.vgubert.retrofitmoney.model.beznal.Beznal
import kotlinx.coroutines.launch
import retrofit2.Response

class SecondViewModel: ViewModel() {
    var repo = Repository()
    val myMoneyList: MutableLiveData<Response<Beznal>> = MutableLiveData()

    fun getBeznalMoney() {
        viewModelScope.launch {
            myMoneyList.value = repo.getBeznal()
        }
    }
}