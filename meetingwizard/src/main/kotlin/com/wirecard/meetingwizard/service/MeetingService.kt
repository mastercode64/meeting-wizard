package com.wirecard.meetingwizard.service

import com.wirecard.meetingwizard.repository.MeetingRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MeetingService {
    @Autowired
    lateinit var meetingRepository: MeetingRepository

    fun listMeetingRooms() =
            meetingRepository.findAll()
}


