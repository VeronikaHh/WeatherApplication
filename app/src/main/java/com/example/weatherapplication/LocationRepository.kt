package com.example.weatherapplication


import androidx.lifecycle.LiveData


class LocationRepository(private val locationsDao: LocationDao) {

    val allLocations: LiveData<List<Location>> = locationsDao.getAllLocations()

    suspend fun insert(location: Location){
        locationsDao.insert(location)
    }

    suspend fun delete(location: Location){
        locationsDao.delete(location)
    }

    suspend fun update(location: Location){
        locationsDao.udate(location)
    }
}