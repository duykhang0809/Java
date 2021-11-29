package datesandtimes;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

public class LastDayOfYear {
    public static void main(String[] args) {

        LocalDate startDate = LocalDate.of(2001, Month.JANUARY, 1);
        LocalDate endDate = LocalDate.of(2099, Month.JANUARY, 1);

        System.out.println("List years with last day of them fall on Monday: " + listYearHasLastDayIsMonday(startDate, endDate));

    }

    public static List<LocalDate> listLastDayOfYearBetweenTwoDates(
            LocalDate startDate, LocalDate endDate) {
        if (startDate.isAfter(endDate))
            throw new DateTimeException("The first date must be before the second date");
        List<LocalDate> listLastDayOfYear = new ArrayList<>();
        startDate = startDate.with(TemporalAdjusters.lastDayOfYear());
        endDate = endDate.with(TemporalAdjusters.lastDayOfYear());
        while (!startDate.isAfter(endDate)) {
            listLastDayOfYear.add(startDate);
            startDate = startDate.plusYears(1);
        }
        return listLastDayOfYear;
    }

    static List<Integer> listYearHasLastDayIsMonday(LocalDate startDate, LocalDate endDate) {
        if (startDate.isAfter(endDate))
            throw new DateTimeException("The first date must be before the second date");
        List<Integer> listYearHasLastDayIsMonday = new ArrayList<>();
        for (LocalDate localDate : listLastDayOfYearBetweenTwoDates(startDate, endDate)) {
            if (localDate.getDayOfWeek().toString().equals("MONDAY")) {
                listYearHasLastDayIsMonday.add(localDate.getYear());
            }
        }
        return listYearHasLastDayIsMonday;
    }
}
