package com.example.usecases

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData

//fun randomNumberGenerator () = Math.random()*1000

fun numberIncrementer(liveData: MutableLiveData<Int>,incrementBy : Int =1)
{
    val oldValue =liveData.value?:0
    liveData.postValue(oldValue+incrementBy)
}


// BBD  given when then
// usecase 1 : Search
// if searching , then do not trigger action
// city name must not be null
// if all OK,trigger search



//usecase 2 : retrieve favourite cities Ids(longs)
// if is retrieving , then do not trigger action
//if favourites is empty , throw an exception
// if favourites not empty,convert them to ids(longs)


// usecase 3 : retrieve cities by Ids
// if is retrieving , then do not trigger action
// if all it OK,trigger action
