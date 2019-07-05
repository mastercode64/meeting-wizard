package com.wirecard.meetingwizard.repository

import com.wirecard.meetingwizard.model.MeetingRoom
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MeetingRepository : JpaRepository<MeetingRoom, Long>