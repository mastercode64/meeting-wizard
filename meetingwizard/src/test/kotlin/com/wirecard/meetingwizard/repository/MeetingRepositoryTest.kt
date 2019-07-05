package com.wirecard.meetingwizard.repository

import com.wirecard.meetingwizard.model.Meeting
import com.wirecard.meetingwizard.model.MeetingRoom
import com.wirecard.meetingwizard.model.Person
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.test.context.junit4.SpringRunner
import java.time.LocalDateTime

@RunWith(SpringRunner::class)
@DataJpaTest
class MeetingRepositoryTest() {
    @Autowired
    private val meetingRepository: MeetingRepository? = null

    @Test
    fun whenCreatingMeetingRepository_thenListObject() {

        val personList = mutableListOf<Person>()

        val meeting = Meeting( null, meetingRoom = MeetingRoom(1), description = "Description", participants = personList, start_date = LocalDateTime.now(), end_date = LocalDateTime.now().plusDays(2))

        meetingRepository!!.save(meeting);

        val meetingList = meetingRepository.findAll();

        assertEquals(1, meetingList.count());
    }
}