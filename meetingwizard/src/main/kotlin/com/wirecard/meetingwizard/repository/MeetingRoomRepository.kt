package com.wirecard.meetingwizard.repository

import com.wirecard.meetingwizard.model.MeetingRoom
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import java.time.LocalDateTime

@Repository
interface MeetingRoomRepository : JpaRepository<MeetingRoom, Long>{

    @Query("SELECT mr FROM MeetingRoom mr " +
            "WHERE (SELECT COUNT(1) FROM Meeting WHERE meeting_room_id = mr.id AND :startDate >= START_DATE AND :endDate < END_DATE) = 0")
    fun findAvailableRooms(@Param("startDate") startDate: LocalDateTime, @Param("endDate") endDate: LocalDateTime) : List<MeetingRoom>
}