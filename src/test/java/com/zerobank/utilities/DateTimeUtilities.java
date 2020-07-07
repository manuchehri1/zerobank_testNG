package com.zerobank.utilities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeUtilities {

    /**
     * MM - to specify month like 01,02,03
     * MM- to specify month like Jan, Feb, Mar
     * MMMM - ..... like March, June
     *
     * dd - .... day, like 01,02,22
     * yyyy- ....year, like 2010,2015
     *
     * @param format MMM dd, yyyy
     * @return current date as a string
     */

    public static String getCurrentDate(String format){
        return LocalDate.now().format(DateTimeFormatter.ofPattern(format));
    }

    /**
     * THis method returns difference between end and start time
     * @param start
     * @param end
     * @param format
     * @return
     */
    public static long getTimeDifference(String start, String end, String format){
        LocalTime startTime = LocalTime.parse(start, DateTimeFormatter.ofPattern(format));
        LocalTime endTime = LocalTime.parse(end, DateTimeFormatter.ofPattern(format));
        return ChronoUnit.HOURS.between(startTime, endTime);

    }
}
