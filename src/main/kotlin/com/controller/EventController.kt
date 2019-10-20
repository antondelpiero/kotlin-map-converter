package com.controller

import com.domain.Event
import com.repository.EventRepository
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import java.util.*
import javax.inject.Inject

@Controller("/events")
class EventController {

    @Inject
    lateinit var eventRepository: EventRepository

    @Post("/")
    fun create(@Body payload: Map<String, String>): Event {
        val event = Event(name = UUID.randomUUID().toString(), payload = payload)
        return eventRepository.save(event)
    }
}
