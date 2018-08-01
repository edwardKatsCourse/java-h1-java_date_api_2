package com.company;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ZonedApiExample {

    public static void main(String[] args) {
        //Double = D
        //double = d
        //Double = double
        //Long = long
        Double d = 11d;
        Long l = 1111111111L;

        //ZonedDateTime - LocalDateTime, by for specific zone
        //ZoneId - list of all available/supported zone
        //OffsetDateTime, ZoneOffset

//        System.out.println(ZoneId.getAvailableZoneIds());
        ZonedDateTime newYork = ZonedDateTime.now(ZoneId.of("America/New_York"));

        String format = newYork.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        ZonedDateTime we = ZonedDateTime.now(ZoneId.systemDefault());


        System.out.println(Duration.between(newYork.toLocalTime(), we.toLocalTime()).toHours());
        System.out.println(ChronoUnit.HOURS.between(newYork.toLocalTime(), we.toLocalTime()));

//        System.out.println(format);

        System.out.println("Enter city, where you live:");
        String myCity = new Scanner(System.in).nextLine();
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        for (String fullTimeZoneName : availableZoneIds) {
            //fullTimeZoneName -> Asia/Tokio

//            String [] zone = fullTimeZoneName.split("/"); //[Asia, Jerusalem], [GB]
//            String city = zone[0];
//
//            //GB
//            if (zone.length > 1) {
//                city = zone[1];
//            }
//            //todo REPLACE UNDERSCORES
//            if (city.equalsIgnoreCase(myCity)) {
//                myCity = fullTimeZoneName;
//                break;
//            }

            if (fullTimeZoneName.replaceAll("_", " ").endsWith(myCity)) {
                myCity = fullTimeZoneName;
                break;
            }
        }

        if (myCity != null && !myCity.isEmpty()) {
            ZoneId userZone = ZoneId.of(myCity);
            System.out.println("Your time is: " + ZonedDateTime.now(userZone).format(DateTimeFormatter.ofPattern("HH:mm")));
        }
    }
}
