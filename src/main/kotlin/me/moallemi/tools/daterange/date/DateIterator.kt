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

import java.util.Calendar
import java.util.Date
import java.util.Locale

class DateIterator(
    startDate: Date,
    private val endDate: Date,
    private val stepDays: Int
) : Iterator<Date> {

    private val calendar = Calendar.getInstance(Locale.getDefault())

    private var currentDate = startDate

    override fun hasNext() = currentDate <= endDate

    override fun next(): Date {
        val next = currentDate

        calendar.time = currentDate
        calendar.add(Calendar.DATE, stepDays)
        currentDate = calendar.time

        return next
    }
}
