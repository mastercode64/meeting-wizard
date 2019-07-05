package com.wirecard.meetingwizard.model

import java.time.LocalDate
import javax.persistence.*

@Entity
data class Meeting(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id : Long? = null,
        @ManyToOne
        @JoinColumn
        val meetingRoom: MeetingRoom? = null,
        val name: String,
        val description: String,
        val owner: String,
        val start_date: LocalDate
)