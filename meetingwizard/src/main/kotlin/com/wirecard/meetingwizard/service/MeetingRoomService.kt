package com.wirecard.meetingwizard.service

import com.wirecard.meetingwizard.model.MeetingRoom
import com.wirecard.meetingwizard.repository.MeetingRepository
import com.wirecard.meetingwizard.repository.MeetingRoomRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@Service
class MeetingRoomService {
    @Autowired
    lateinit var meetingRoomRepository: MeetingRoomRepository

    @Autowired
    lateinit var meetingRepository: MeetingRepository

    fun listMeetingRooms() =
            meetingRoomRepository.findAll()

    fun getAvailableMeetingRoomBetween(start: String, end: String): List<MeetingRoom> {
        var formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
        var startDate = LocalDateTime.parse(start, formatter)
        var endDate = LocalDateTime.parse(end, formatter)
        return meetingRoomRepository.findAvailableRooms(startDate, endDate)
    }
}


