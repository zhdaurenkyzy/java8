package com.company.myClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeCompare {

    public void getCompareDate(LocalDate otherDate) {
        LocalDate now = LocalDate.now();
        boolean after = now.isAfter(otherDate);
        boolean before = now.isBefore(otherDate);
    }

    public void getCompareTime(LocalTime otherTime) {
        LocalTime now = LocalTime.now();
        boolean after = now.isAfter(otherTime);
        boolean before = now.isBefore(otherTime);
    }

    public void getCompareDateTime(LocalDateTime otherDateTime) {
        LocalDateTime now = LocalDateTime.now();
        boolean after = now.isAfter(otherDateTime);
        boolean before = now.isBefore(otherDateTime);
    }

}
