package com.converter

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import io.micronaut.context.annotation.Factory
import io.micronaut.core.convert.TypeConverter
import java.util.*
import javax.inject.Singleton

@Factory
class MapStringConverters {
    @Singleton
    fun mapStringTypeConverter(): TypeConverter<Map<String, String>, String> {
        return TypeConverter { value, _, _ ->
            val o = jacksonObjectMapper()
            Optional.of<String>(o.writeValueAsString(value))
        }
    }

    @Singleton
    fun stringMapTypeConverter(): TypeConverter<String, Map<String, String>> {
        return TypeConverter { value, _, _ ->
            val o = jacksonObjectMapper()
            Optional.of<Map<String, String>>(o.readValue(value))
        }
    }
}
