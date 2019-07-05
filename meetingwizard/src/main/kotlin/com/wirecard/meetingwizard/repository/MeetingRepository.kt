package com.wirecard.meetingwizard.repository

import com.wirecard.meetingwizard.model.Meeting
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MeetingRepository : JpaRepository<Meeting, Long> {
}