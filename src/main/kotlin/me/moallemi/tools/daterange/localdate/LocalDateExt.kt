package me.moallemi.tools.daterange.localdate

import java.time.LocalDate

operator fun LocalDate.rangeTo(other: LocalDate) = LocalDateRange(this, other)