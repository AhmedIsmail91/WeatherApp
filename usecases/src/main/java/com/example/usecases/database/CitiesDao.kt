package com.example.usecases.database

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import com.example.entities.City

@Dao interface CitiesDao
{
    @Query("select * from City where City.name like :name")
    fun queryCitiesbyName(name :  String) : List<City>

    @Query("select * from City where City.id in (:ids)")
    fun queryCitiesbyIds(ids :  List<Int>) : List<City>
}
