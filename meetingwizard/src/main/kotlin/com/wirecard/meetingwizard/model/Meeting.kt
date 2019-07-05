package com.wirecard.meetingwizard.model

import java.util.*
import javax.persistence.*

@Entity
data class Meeting(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id : Long,
        @ManyToOne @JoinColumn
        val meetingRoom: MeetingRoom,
        val name: String,
        val description: String,
        val owner: String,
        val start_date: Date
)
