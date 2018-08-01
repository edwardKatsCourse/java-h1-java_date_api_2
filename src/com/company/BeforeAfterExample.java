package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BeforeAfterExample {

    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime endDay = start
                .toLocalDate()
                .atStartOfDay()
                .plusDays(3)
                .minusSeconds(1);

        while (start.isBefore(endDay)) {

            start = start.plusSeconds(1); //23:59 -> 00:00
            //                            //start: 23:59:00 - end 23:59:59

            if (start.getHour() == 23 || start.getHour() == 11) {
                System.out.println("Using servers. Now it is " +
                        start.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")));
            }
        }

        if (start.getDayOfMonth() > 3) {
            System.out.println("Charge double");
        } else {
            System.out.println("just in time");
        }
        System.out.println(start.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")));
        //Period, Duration, ZoneDateTime
    }
}
