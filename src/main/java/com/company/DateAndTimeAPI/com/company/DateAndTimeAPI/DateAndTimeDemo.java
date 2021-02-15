package com.company.DateAndTimeAPI;

import java.time.*;

public class DateAndTimeDemo {
    public static void main(final String[] args) {

        final LocalDate date = LocalDate.now();
        System.out.println("Date: "+ date);
        System.out.println("Day: " + date.getDayOfMonth());
        System.out.println("Month: " +date.getMonthValue());
        System.out.println("Year: "+ date.getYear());
        System.out.println("Month length: "+ date.lengthOfMonth());
        System.out.printf("Date: %d-%d-%d", date.getDayOfMonth(), date.getMonthValue(), date.getYear());
        System.out.println("\n\n\n");

        final LocalTime time = LocalTime.now();
        System.out.println("Time: "+ time);
        System.out.println("Hours: "+ time.getHour());
        System.out.println("Minutes: "+ time.getMinute());
        System.out.println("Seconds: "+ time.getSecond());
        System.out.println("Nano Seconds: "+ time.getNano());
        System.out.printf("Time: %d:%d:%d:%d", time.getHour(), time.getMinute(), time.getSecond(), time.getNano());
        System.out.println("\n\n\n");

        //Alternative Class, all methods are same as LocalDate and LocalTime
        final LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date and Time: "+ dateTime );
        System.out.println("Day: "+ dateTime.getDayOfYear());
        System.out.println("Day: "+ dateTime.getDayOfMonth());
        System.out.println("Day: "+ date.getDayOfWeek());
        System.out.println("Hours: "+ dateTime.getHour());
        System.out.println("\n\n\n");

        //Creating object of date and Time
        final LocalDateTime myDateTimeA = LocalDateTime.of(2000, 8, 3, 4, 35);
        final LocalDateTime myDateTimeB = LocalDateTime.of(2000, Month.AUGUST, 3, 4, 35);
        System.out.println(myDateTimeA);
        System.out.println(myDateTimeB);
        System.out.println("\n");

        System.out.println("After Six Months: "+ dateTime.plusMonths(6));
        System.out.println("Before two weeks: "+ dateTime.minusDays(2));
        System.out.println("After five days : "+ dateTime.plusDays(5));

        //Period
        System.out.println("\nPeriods Example");
        final LocalDate birthDay = LocalDate.of(2000, Month.AUGUST, 14);
        System.out.println(birthDay);
        final LocalDate today = LocalDate.now();
        final Period period= Period.between(birthDay, today);
        System.out.println("Years: "+ period.getYears());
        System.out.println("Months: "+ period.getMonths());
        System.out.println("Days: "+ period.getDays());
        final int days = period.getYears()*365+period.getMonths()*7+period.getDays();
        System.out.println("Total no of days: "+ days);
        System.out.println();

        //Zone
        final ZoneId zone = ZoneId.systemDefault();
        System.out.println("Current zone: "+ zone);
        ZoneId zoneId = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
        System.out.println("zonedDateTime: "+ zonedDateTime);
    }
}
