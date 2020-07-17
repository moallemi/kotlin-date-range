/*
 * Copyright 2020 Reza Moallemi
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.moallemi.tools.daterange.date

import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
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

    @Test
    fun testEmpty() {
        val expected = listOf<Date>()

        val actual = DateRange.EMPTY.toList()

        assertEquals(expected, actual)
    }
}
