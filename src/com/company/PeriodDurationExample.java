package com.company;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class PeriodDurationExample {


    public static void main(String[] args) {
        //Period/Duration
        //Period - dates
        //Duration - time

//        LocalDate start = LocalDate.now()
//                .atStartOfDay()
//                .toLocalDate()
//                .withDayOfYear(1);

        LocalDate start = LocalDate.of(1948, 5, 14);


        LocalDate today = LocalDate.now();
//                LocalDate.of(2018, 1, 20);

        //1. Period
        //2. ChronoUnit

        long daysFromStartOfTheYear = ChronoUnit.MONTHS.between(start, today);


        System.out.println(daysFromStartOfTheYear);

        LocalDateTime previousWebinar = LocalDateTime
                .now()
                .minusDays(3)
                .withHour(20)
                .withMinute(30)
                .withSecond(0);

        LocalDateTime now = LocalDateTime.now();

        System.out.println("Hours between now and previous webinar");
        System.out.println(ChronoUnit.HOURS.between(previousWebinar, now));

        Integer dollarsPerHour = 10;
        LocalDateTime customerStarted = LocalDateTime.of(2018, Month.AUGUST, 1, 18, 9,0);


        LocalDateTime customerEnded = LocalDateTime.now();

        long hoursBetween = ChronoUnit.HOURS.between(customerStarted, customerEnded);

        long minutesBetween = ChronoUnit.MINUTES.between(customerStarted, customerEnded);
        hoursBetween = ( ((double) minutesBetween / (double) hoursBetween) > 60d) ? hoursBetween + 1 : hoursBetween;
        //60.9 = 60.1
        //5/3
        System.out.println("Total payment: " + hoursBetween * dollarsPerHour);


        LocalDate yearStart = LocalDate.of(2018, 1, 1);
//        LocalDate now = LocalDate.now();

        System.out.println(ChronoUnit.DAYS.between(yearStart, now));

    }

}
