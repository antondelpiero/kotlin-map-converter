package com.domain

import io.micronaut.data.annotation.MappedEntity
import io.micronaut.data.annotation.TypeDef
import io.micronaut.data.model.DataType
import javax.persistence.GeneratedValue
import javax.persistence.Id

@MappedEntity
data class Event(
        @Id
        @GeneratedValue
        var id: Long? = null,
        var name: String,
        @TypeDef(type = DataType.STRING)
        var payload: Map<String, String>
)
