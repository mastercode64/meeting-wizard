package com.wirecard.meetingwizard.controller

import com.wirecard.meetingwizard.model.Meeting
import com.wirecard.meetingwizard.service.MeetingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.xml.ws.Response

@RestController
@RequestMapping("/meeting")
class MeetingController {

    @Autowired
    lateinit var meetingService: MeetingService

    @PostMapping
    fun createMeeting(@RequestBody meeting: Meeting) : ResponseEntity<Any> {
        return ResponseEntity(meetingService.createMeeting(meeting), HttpStatus.CREATED)
    }

    @GetMapping
    fun getMeetings() : ResponseEntity<Any> {
        return ResponseEntity(meetingService.getMeetings(), HttpStatus.OK)
    }

}