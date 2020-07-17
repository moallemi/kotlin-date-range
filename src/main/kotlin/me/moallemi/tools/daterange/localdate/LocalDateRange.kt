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

class LocalDateRange(
    override val start: LocalDate,
    override val endInclusive: LocalDate,
    private val stepDays: Long = 1
) : Iterable<LocalDate>, ClosedRange<LocalDate> {

    override fun iterator(): Iterator<LocalDate> =
        LocalDateIterator(start, endInclusive, stepDays)

    infix fun step(days: Long) = LocalDateRange(start, endInclusive, days)

    companion object {
        val EMPTY: LocalDateRange = LocalDateRange(LocalDate.ofEpochDay(1), LocalDate.ofEpochDay(0))
    }
}
