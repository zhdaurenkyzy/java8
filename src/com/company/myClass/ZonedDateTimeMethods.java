package com.company.myClass;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class ZonedDateTimeMethods {

    public void getCreateZonedDateTime() {
        ZonedDateTime now = ZonedDateTime.now();
        LocalDate localDate = LocalDate.of(2020, 4, 26);
        LocalTime localTime = LocalTime.of(8, 30);
        ZoneId zone = ZoneId.of("Europe/Kiev");
        ZonedDateTime kievTime = ZonedDateTime.of(localDate, localTime, zone);
    }

    public void getConverterZone() {
        LocalDate localDate = LocalDate.of(2019, 12, 31);
        LocalTime localTime = LocalTime.of(22, 2);
        ZoneId zoneId = ZoneId.of("Europe/Kiev");

        ZonedDateTime kievTime = ZonedDateTime.of(localDate, localTime, zoneId);
        ZonedDateTime nyTime = kievTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime japanTime = kievTime.withZoneSameInstant(ZoneOffset.of("-9:00"));
    }

    public void getAllZone() {
        List<String> zones = new ArrayList<>(ZoneId.getAvailableZoneIds());
        zones.forEach(System.out::println);
    }

}
