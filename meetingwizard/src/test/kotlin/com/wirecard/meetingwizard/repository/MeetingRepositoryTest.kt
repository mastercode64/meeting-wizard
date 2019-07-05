package com.wirecard.meetingwizard.repository

import com.wirecard.meetingwizard.model.Meeting
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.test.context.junit4.SpringRunner
import java.time.LocalDate

@RunWith(SpringRunner::class)
@DataJpaTest
class MeetingRepositoryTest() {
    @Autowired
    private val meetingRepository: MeetingRepository? = null

    @Test
    fun whenCreatingMeetingRepository_thenListObject() {
        val meeting = Meeting(null, null, "Name", "Description", "Luis", LocalDate.now())

        meetingRepository!!.save(meeting);

        val meetingList = meetingRepository.findAll();

        assertEquals(1, meetingList.count());
    }
}