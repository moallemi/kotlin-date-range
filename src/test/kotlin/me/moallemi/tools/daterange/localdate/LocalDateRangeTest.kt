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

package me.moallemi.tools.daterange.localdate

import java.time.LocalDate
import junit.framework.TestCase.assertEquals
import org.junit.Test

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

    @Test
    fun testEmpty() {
        val expected = listOf<LocalDate>()

        val actual = LocalDateRange.EMPTY.toList()

        assertEquals(expected, actual)
    }
}
