package com.wirecard.meetingwizard.repository

import com.wirecard.meetingwizard.model.Meeting
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MeetingRoomRepository: CrudRepository<Meeting, Long> {
}