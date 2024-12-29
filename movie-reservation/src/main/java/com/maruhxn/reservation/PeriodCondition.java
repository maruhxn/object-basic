package com.maruhxn.reservation;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class PeriodCondition implements DiscountCondition {
    private DayOfWeek dayOfWeek;
    private LocalTime startTime, endTime;

    public boolean isSatisfiedBy(Screening screening) {
        return  screening.getStartTime()
                .getDayOfWeek().equals(dayOfWeek) &&
                startTime.compareTo(screening.getStartTime().toLocalTime()) <= 0 &&
                endTime.compareTo( screening.getStartTime()
                        .toLocalTime()) >= 0;
    }
}