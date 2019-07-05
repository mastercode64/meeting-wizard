package com.wirecard.meetingwizard.controller

import com.wirecard.meetingwizard.service.MeetingRoomService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus.OK
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/rooms")
class MeetingRoomController {

    @Autowired
    lateinit var meetingRoomService: MeetingRoomService

    @GetMapping
    fun getMeetingRooms(): ResponseEntity<Any> {
        return ResponseEntity(meetingRoomService.listMeetingRooms(), OK)
    }

    @GetMapping("available")
    fun getAvailableMeetingRoomsBetween(@RequestParam start: String, @RequestParam end: String): ResponseEntity<Any> {
        return ResponseEntity(meetingRoomService.getAvailableMeetingRoomBetween(start, end), OK)
    }


}