package datesandtimes;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class NumberOfDayBetweenTwoDates {
    public static void main(String[] args) {

        LocalDate localDate1 = LocalDate.of(1968, Month.JANUARY, 12);

        LocalDate localDate2 = LocalDate.of(1969, Month.SEPTEMBER, 19);

        System.out.println("Number of days between " + localDate1 + " and " + localDate2 + " is " + numberOfDays(localDate1, localDate2));
    }

    static long numberOfDays(LocalDate localDate1, LocalDate localDate2) {
        if (localDate1.isAfter(localDate2))
            throw new DateTimeException("The first date must be before the second date");
        return ChronoUnit.DAYS.between(localDate1, localDate2);
    }
}
