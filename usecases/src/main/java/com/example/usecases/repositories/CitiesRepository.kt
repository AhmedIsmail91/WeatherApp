package com.example.usecases.repositories

import com.example.entities.City
import com.example.entities.FavoriteCityId
import com.example.usecases.database.WeatherDatabase
import com.example.usecases.database.weatherDatabase

val citiesRepository by lazy { CitiesRepository() }

class CitiesRepository(private val database: Lazy<WeatherDatabase> = lazy {weatherDatabase}) {

    fun searchCitiesByName(name: String): List<City> = database.value.citiesDao.queryCitiesbyName(name)

    fun retrieveFavouriteCitiesIds(): List<FavoriteCityId> = database.value.favouritesDao.queryAll()

    fun retrieveCitiesByIds(citiesIds: List<Long>) = database.value.citiesDao.queryCitiesbyIds(citiesIds)

    fun addFavouriteCityID(favouriteCityId: FavoriteCityId) = database.value.favouritesDao.insert(favouriteCityId)

    fun removeFavouriteCityID(favouriteCityId: FavoriteCityId) = database.value.favouritesDao.delete(favouriteCityId)
}
