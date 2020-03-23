package me.moallemi.tools.daterange.date

import java.util.Date

operator fun Date.rangeTo(other: Date) = DateRange(this, other)
