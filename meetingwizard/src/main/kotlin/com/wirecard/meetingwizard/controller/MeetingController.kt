package com.wirecard.meetingwizard.controller

import com.wirecard.meetingwizard.model.MeetingRoom
import org.springframework.http.HttpStatus.OK
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/rooms")
class MeetingController{

    @GetMapping
    fun getMeetingRooms(): ResponseEntity<Any> {

        val list = mutableListOf<MeetingRoom>()

        val meeting = MeetingRoom(roomName = "sala1")
        meeting.id = 1
        meeting.roomName = "teste"

        list.add(meeting)

        return ResponseEntity(list, OK)
    }



}