package com.wirecard.meetingwizard.controller

import com.wirecard.meetingwizard.service.PersonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("person")
class PersonController {

    @Autowired
    lateinit var personService: PersonService


    @GetMapping
    fun getPerson(): ResponseEntity<Any> {

        return ResponseEntity(personService.listPerson(), HttpStatus.OK)

    }
}