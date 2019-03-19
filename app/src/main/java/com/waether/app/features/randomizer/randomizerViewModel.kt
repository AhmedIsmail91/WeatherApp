package com.waether.app.Feature.randomizer

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.example.usecases.Ticker
import com.example.usecases.randomNumberGenerator

private const val DEFAULT_VALUE=0

class RandomizerViewModel : ViewModel()
{
   private val ticker = initializeTicker()
    val numberLiveData = MutableLiveData<Int>()

    init {
        numberLiveData.value=DEFAULT_VALUE
        ticker.start()
    }

    private fun initializeTicker() = Ticker {
        numberLiveData.postValue(randomNumberGenerator().toInt())
    }

    override fun onCleared() {
        super.onCleared()
        // newwwww

    }
}