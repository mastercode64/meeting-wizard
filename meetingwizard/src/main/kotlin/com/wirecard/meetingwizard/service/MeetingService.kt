package com.wirecard.meetingwizard.service

import com.wirecard.meetingwizard.model.Meeting
import com.wirecard.meetingwizard.repository.MeetingRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MeetingService {

    @Autowired
    lateinit var meetingRepository: MeetingRepository

    fun createMeeting(meeting : Meeting) = meetingRepository.save(meeting)

    fun getMeetings(): List<Meeting> = meetingRepository.findAll()
}