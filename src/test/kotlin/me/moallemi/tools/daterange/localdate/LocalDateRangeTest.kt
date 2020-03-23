package me.moallemi.tools.daterange.localdate

import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.time.LocalDate

class LocalDateRangeTest {

    @Test
    fun testRange() {
        val expected = listOf(
            "2020-01-01",
            "2020-01-02",
            "2020-01-03",
            "2020-01-04",
            "2020-01-05"
        )
        val startDate = LocalDate.of(2020, 1, 1)
        val endDate = LocalDate.of(2020, 1, 5)

        val actual = (startDate..endDate).iterator().asSequence().toList().map { it.toString() }

        assertEquals(expected, actual)
    }

    @Test
    fun testStep() {
        val expected = listOf(
            "2020-01-01",
            "2020-01-03",
            "2020-01-05"
        )
        val startDate = LocalDate.of(2020, 1, 1)
        val endDate = LocalDate.of(2020, 1, 5)

        val actual = (startDate..endDate step 2).iterator().asSequence().toList().map { it.toString() }

        assertEquals(expected, actual)
    }

    @Test
    fun testContains() {
        val startDate = LocalDate.of(2020, 1, 1)
        val endDate = LocalDate.of(2020, 1, 5)

        val actual = LocalDate.of(2020, 1, 2) in (startDate..endDate)

        assertEquals(true, actual)
    }
}
