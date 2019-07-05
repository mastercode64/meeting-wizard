package com.wirecard.meetingwizard.model

import javax.persistence.*

@Entity
data class MeetingRoom(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,

        val roomName: String? = null,

        @OneToMany(mappedBy = "meetingRoom")
        val meeting: List<Meeting>? = null
)

