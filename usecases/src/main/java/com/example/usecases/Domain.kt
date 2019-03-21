package com.example.usecases

import android.app.Application
import android.arch.lifecycle.MutableLiveData
import java.lang.Appendable

internal val applicationLiveData =MutableLiveData<Application>()


// !! means get application or crash
//extension function // internal not accessed except this module

//internal fun MutableLiveData<Application>.getApplication():Application{
//    return this.value!!
//}
internal fun MutableLiveData<Application>.getApplication() = value!!


//internal fun <T> MutableLiveData<T>.getNonNull():T{
//    return this.value!!
//}


object Domain{
    fun integrateWith(application: Application)
    {
        applicationLiveData.value=application
    }
}