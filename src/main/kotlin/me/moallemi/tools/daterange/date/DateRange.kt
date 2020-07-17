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

import java.util.Date

class DateRange(
    override val start: Date,
    override val endInclusive: Date,
    private val stepDays: Int = 1
) : Iterable<Date>, ClosedRange<Date> {

    override fun iterator(): Iterator<Date> = DateIterator(start, endInclusive, stepDays)

    infix fun step(days: Int) = DateRange(start, endInclusive, days)

    companion object {
        val EMPTY: DateRange = DateRange(Date(1), Date(0))
    }
}
