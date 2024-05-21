package DateAndTime;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Local date and time - a date without time zone

        LocalDate today = LocalDate.now();
        System.out.println("Today's date :" + today);

        ZonedDateTime zonedate = ZonedDateTime.now();
        System.out.println("Today's date with timezone " + zonedate);

Days days = Days.Wednesday;

String day = Days.Firday.name();
        System.out.println("Today " + day);

        LocalDate date = LocalDate.now();
        System.out.println("Now " + date);

    }
}
