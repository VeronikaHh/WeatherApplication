package com.example.weatherapplication

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "locationsTable")
class Location(@ColumnInfo(name = "city")val city:String,
           @ColumnInfo(name = "description")val weatherDescroption: String,
           @ColumnInfo(name = "time")val locationTime: String,
           @ColumnInfo(name = "tempreture")val locationTempreture: Int,
           @ColumnInfo(name = "lowTempreture")val locationLowTempreture: Int,
           @ColumnInfo(name = "highTempreture")val locationHighTempreture: Int
){
    @PrimaryKey(autoGenerate = true)
    var id = 0
}