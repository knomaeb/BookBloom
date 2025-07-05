package com.example.bookbloom.data.converters

import androidx.room.TypeConverter
import kotlinx.serialization.json.Json

object StringTypeConverters {
    @TypeConverter
    fun toString(list: List<String>): String {
        return Json.encodeToString(list)
    }

    @TypeConverter
    fun fromString(value: String): List<String> {
        return Json.decodeFromString(value)
    }
}