package me.moallemi.tools.daterange.date

import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale
import junit.framework.TestCase.assertEquals
import org.junit.Test

class DateRangeTest {

    private val calendar = Calendar.getInstance(Locale.getDefault())
    private val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())

    @Test
    fun testRange() {
        val expected = listOf(
            "2020-01-01",
            "2020-01-02",
            "2020-01-03",
            "2020-01-04",
            "2020-01-05"
        )
        calendar.set(2020, 0, 1)
        val startDate = calendar.time
        calendar.set(2020, 0, 5)
        val endDate = calendar.time

        val actual = (startDate..endDate).map {
            simpleDateFormat.format(it)
        }

        assertEquals(expected, actual)
    }

    @Test
    fun testStep() {
        val expected = listOf(
            "2020-01-01",
            "2020-01-03",
            "2020-01-05"
        )
        calendar.set(2020, 0, 1)
        val startDate = calendar.time
        calendar.set(2020, 0, 5)
        val endDate = calendar.time

        val actual = (startDate..endDate step 2).map {
            simpleDateFormat.format(it)
        }

        assertEquals(expected, actual)
    }
}
