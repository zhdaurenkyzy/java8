package com.company.myClass;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class NewDateAndTimeAPI {

    public void getCreateDate() {
        LocalDate.of(2020, Month.AUGUST, 23);
        LocalDate.of(2020, 4, 24);
        System.out.println(LocalDate.ofYearDay(2020, 151));
    }

    public void getCreateTime() {
        LocalTime.of(17, 21);
        LocalTime.of(18, 15, 30);
        LocalTime.of(23, 59, 59, 700);
        LocalTime.ofSecondOfDay(9_124); // 02:32:04
        LocalTime.ofNanoOfDay(100_000_000_000L); // 00:01:40
    }

    public void getDateTime() {
        LocalDateTime.of(1992, Month.AUGUST, 24, 12, 0);
        LocalDateTime.of(2004, Month.APRIL, 23, 17, 15, 2);
        LocalDateTime.of(2009, 1, 13, 9, 7);
        LocalDateTime.of(LocalDate.now(), LocalTime.now());
    }

    public void getPlusDate() {
        LocalDate now = LocalDate.now(); // 2020-04-24
        LocalDate plus2Days = now.plusDays(2);
        LocalDate plusDays = now.plusDays(-2); // 2020-04-22
        LocalDate plusWeek = now.plusWeeks(1);
        LocalDate plus3Month = now.plusMonths(3);
        LocalDate plusPeriod = now.plus(Period.ofDays(4));
        LocalDate plusMillennia = now.plus(1, ChronoUnit.MILLENNIA);
    }

    public void getMinusDate() {
        LocalDate now = LocalDate.now();
        LocalDate minusDate = now.minusDays(2);
        LocalDate minusWeek = now.minusMonths(3);
        LocalDate minusMonth = now.minusMonths(4);
        LocalDate minusPeriod = now.minus(Period.ofYears(5));
        LocalDate minusCenturies = now.minus(1, ChronoUnit.CENTURIES);

    }

    public void getMinusAndPlusTime() {
        LocalTime now = LocalTime.now();
        LocalTime plusNanos = now.plusNanos(100_000);
        LocalTime plusSeconds = now.plusSeconds(200);
        LocalTime minusMinutes = now.minusMinutes(10);
        LocalTime minusHours = now.minusHours(-5);
        LocalTime plusMillis = now.plus(Duration.ofMillis(100));
        LocalTime minusHalfDay = now.minus(1, ChronoUnit.HALF_DAYS);
    }

    public void getMinusAndPlusDateTime() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime plusNanos = now.plusNanos(780_000_000);
        LocalDateTime minusHours = now.minusHours(4);
        LocalDateTime plusYears = now.plusYears(10);
        LocalDateTime minusDecades = now.minus(1, ChronoUnit.DECADES);
    }

}
