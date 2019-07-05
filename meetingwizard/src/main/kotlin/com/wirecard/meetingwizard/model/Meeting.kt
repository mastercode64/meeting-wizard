package com.wirecard.meetingwizard.model

import java.time.LocalDateTime
import javax.persistence.*

@Entity
data class Meeting(

        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,

        @ManyToOne @JoinColumn
        val meetingRoom: MeetingRoom? = null,

        val name: String? = null,

        val description: String? = null,

        val start_date: LocalDateTime? = null,

        val end_date: LocalDateTime? = null,

        @OneToMany
        val participants: List<Person>
)
