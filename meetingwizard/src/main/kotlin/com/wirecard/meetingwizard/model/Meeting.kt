package com.wirecard.meetingwizard.model

import javax.persistence.*


@Entity
data class MeetingRoom (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    var roomName: String
)
