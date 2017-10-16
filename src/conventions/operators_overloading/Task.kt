package conventions.operators_overloading

import conventions.operators_overloading.TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = addTimeIntervals(timeInterval, 1)
operator fun MyDate.plus(timesTimeInterval: TimesTimeInterval): MyDate = addTimeIntervals(timesTimeInterval.timeInterval, timesTimeInterval.times)

data class TimesTimeInterval(val timeInterval: TimeInterval, val times: Int)

operator fun TimeInterval.times(times: Int): TimesTimeInterval = TimesTimeInterval(this, times)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}