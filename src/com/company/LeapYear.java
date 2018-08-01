package com.company;

import java.time.LocalDate;

public class LeapYear {

    public static void main(String[] args) {
	    //Java Date API #2

        //Leap year

        LocalDate startYear = LocalDate.of(1900, 1, 1);
        LocalDate endYear = LocalDate.of(2025, 1, 1);

        while (true) {
            if (startYear.isLeapYear()) {
                System.out.printf("%s is a leap year\n", startYear.getYear());
            }

            startYear = startYear.plusYears(1);


            //.isBefore()
            //.isAfter()
            //.isEqual()
            if (startYear.isEqual(endYear)) {
                break;
            }
        }

    }
}
