package me.moallemi.tools.daterange.date

import java.util.Date

class DateRange(
    override val start: Date,
    override val endInclusive: Date,
    private val stepDays: Int = 1
) : Iterable<Date>, ClosedRange<Date> {

    override fun iterator(): Iterator<Date> =
        DateIterator(start, endInclusive, stepDays)

    infix fun step(days: Int) = DateRange(start, endInclusive, days)
}
