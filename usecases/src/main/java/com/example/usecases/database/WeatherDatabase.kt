package com.example.usecases.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.example.entities.City
import com.example.entities.FavoriteCityId

@Database(
    entities = [City::class,FavoriteCityId::class],
    version = 1,
    exportSchema = false
)
abstract class WeatherDatabase : RoomDatabase(){
    abstract val citiesDao : CitiesDao
    abstract val favouritesDao : FavouritesDao

}