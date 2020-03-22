package me.moallemi.tools.daterange.localdate

import java.time.LocalDate

class DateIterator(
    val startDate: LocalDate,
    val endDate: LocalDate,
    val stepDays: Long
) : Iterator<LocalDate> {
    private var currentDate = startDate

    override fun hasNext() = currentDate <= endDate

    override fun next(): LocalDate {
        val next = currentDate
        currentDate = currentDate.plusDays(stepDays)
        return next
    }
}