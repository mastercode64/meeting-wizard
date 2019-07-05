package com.wirecard.meetingwizard.controller

import com.wirecard.meetingwizard.model.MeetingRoom
import com.wirecard.meetingwizard.service.MeetingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus.OK
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/rooms")
class MeetingController {

    @Autowired
    lateinit var meetingService: MeetingService

    @GetMapping
    fun getMeetingRooms(): ResponseEntity<Any> {
                return ResponseEntity(meetingService.listMeetingRooms(), OK)
    }





}