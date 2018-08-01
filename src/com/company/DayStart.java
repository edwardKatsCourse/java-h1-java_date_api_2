package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DayStart {

    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.now();
//        start.withHour(0).withMinute(0).withSecond(0);
        start = start.toLocalDate().atStartOfDay();

        System.out.println(start);

        LocalDateTime endDate = start.plusDays(3).minusSeconds(1);
        System.out.println(endDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

    }
}
