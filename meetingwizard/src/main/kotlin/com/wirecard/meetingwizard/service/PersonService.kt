package com.wirecard.meetingwizard.service

import com.wirecard.meetingwizard.repository.PersonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PersonService {

    @Autowired
    lateinit var personRepository: PersonRepository

    fun listPerson() = personRepository.findAll()
}