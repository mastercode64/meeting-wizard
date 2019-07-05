package com.wirecard.meetingwizard.model

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity
data class MeetingRoom(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,

        val roomName: String? = null,

        @OneToMany(mappedBy = "meetingRoom")
        @JsonIgnore
        val meeting: List<Meeting>? = null
)

