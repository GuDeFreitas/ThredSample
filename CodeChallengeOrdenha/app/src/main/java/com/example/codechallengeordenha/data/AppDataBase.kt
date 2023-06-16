package com.example.codechallengeordenha.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.codechallengeordenha.BarChartApplication

@Database(entities = [BarChartApplication::class], version = 4)

abstract class AppDataBase : RoomDatabase() {

    abstract fun itemDao(): ItemDao
}