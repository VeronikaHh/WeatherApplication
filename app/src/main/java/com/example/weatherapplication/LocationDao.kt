package com.example.weatherapplication


import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface LocationDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(location: Location)

    @Update
    fun udate(location: Location)

    @Delete
    fun delete(location: Location)

    @Query("Select * from LocationsTable order by id ASC")
    fun getAllLocations(): LiveData<List<Location>>
}