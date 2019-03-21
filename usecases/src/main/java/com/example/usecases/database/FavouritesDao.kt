package com.example.usecases.database

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.example.entities.FavoriteCityId

@Dao
interface FavouritesDao
{
    @Query("select * from FavoriteCityId")
    fun queryAll() : List<FavoriteCityId>


    @Insert
    fun insert(id : FavoriteCityId)


    @Delete
    fun delete(id : FavoriteCityId)


}
