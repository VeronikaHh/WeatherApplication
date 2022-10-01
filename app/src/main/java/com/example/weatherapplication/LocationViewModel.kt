package com.example.weatherapplication

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LocationViewModel(application: Application): AndroidViewModel(application) {

    val allLocations: LiveData<List<Location>>
    val repository: LocationRepository

    init {
        val dao = LocationDatabase.getDatabase(application).getLocationsDao()
        repository = LocationRepository(dao)
        allLocations = repository.allLocations
    }

    fun deleteLocation(location: Location) = viewModelScope.launch(Dispatchers.IO) {
        repository.delete(location)
    }

    fun updateLocation(location: Location) = viewModelScope.launch(Dispatchers.IO) {
        repository.update(location)
    }
    fun addLocation(location: Location) = viewModelScope.launch(Dispatchers.IO) {
        repository.insert(location)
    }

}