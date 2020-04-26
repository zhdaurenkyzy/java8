package com.company.myClass;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class DateTimeFormatMethods {

    public void getDateFormat() {
        LocalDate now = LocalDate.now();
        String basicIsoDate = now.format(java.time.format.DateTimeFormatter.BASIC_ISO_DATE); // 20200426
        String isoDate = now.format(DateTimeFormatter.ISO_DATE); // 2020-04-26
        String isoWeekDate = now.format(DateTimeFormatter.ISO_WEEK_DATE); // 2020-W17-7
        String isoLocalDate = now.format(DateTimeFormatter.ISO_LOCAL_DATE); // 2020-04-26
        String isoOrdinalDate = now.format(DateTimeFormatter.ISO_ORDINAL_DATE); // 2020-026
    }

    public void getDatePattern() {
        LocalDate now = LocalDate.now();
        String nativeDate = now.format(DateTimeFormatter.ofPattern("dd MMM yyyy")); // 26 Apr 2020
        String french = now.format(DateTimeFormatter.ofPattern("dd MMM yyyy", Locale.FRANCE)); // 28 avr. 2020
    }

    public void getTimePattern() {
        LocalTime now = LocalTime.now();
        String nativeTime = now.format(DateTimeFormatter.ofPattern("hh mm ss"));
        String engFormat = now.format(DateTimeFormatter.ofPattern("hh mm a"));
    }
}
