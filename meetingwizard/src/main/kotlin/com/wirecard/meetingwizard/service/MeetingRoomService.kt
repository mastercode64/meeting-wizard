package com.wirecard.meetingwizard.service

import com.wirecard.meetingwizard.repository.MeetingRoomRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MeetingRoomService {
    @Autowired
    lateinit var meetingRoomRepository: MeetingRoomRepository

    fun listMeetingRooms() =
            meetingRoomRepository.findAll()
}


