package datesandtimes;

import org.junit.Assert;
import org.junit.Test;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class LastDayOfYearTest {

    @Test
    public void given_twoDates_when_theyAreValid_then_returnListLastDayOfYearsOfThem() {
        LocalDate startDate = LocalDate.of(2001, Month.JANUARY, 1);

        LocalDate endDate = LocalDate.of(2005, Month.JANUARY, 2);

        List<LocalDate> listLastDayOfYearsActual = LastDayOfYear.listLastDayOfYearBetweenTwoDates(startDate, endDate);

        List<LocalDate> listLastDayOfYearsExpected = Arrays.asList(LocalDate.of(2001, Month.DECEMBER, 31),
                LocalDate.of(2002, Month.DECEMBER, 31),
                LocalDate.of(2003, Month.DECEMBER, 31),
                LocalDate.of(2004, Month.DECEMBER, 31),
                LocalDate.of(2005, Month.DECEMBER, 31));

        Assert.assertEquals(listLastDayOfYearsExpected, listLastDayOfYearsActual);
    }

    @Test
    public void given_twoDates_when_theyAreValid_then_returnListYearsHasLastDayIsMondayBetweenThem() {

        LocalDate startDate = LocalDate.of(2001, Month.JANUARY, 1);
        LocalDate endDate = LocalDate.of(2020, Month.JANUARY, 1);

        List<Integer> listYearsActual = LastDayOfYear.listYearHasLastDayIsMonday(startDate, endDate);
        List<Integer> listYearsExpected = Arrays.asList(2001,2007,2012,2018);

        Assert.assertEquals(listYearsExpected, listYearsActual);
    }

    @Test(expected = DateTimeException.class)
    public void given_twoDates_when_theFirstDateIsAfterTheSecondDate_then_throwDateTimeException() {

        LocalDate startDate = LocalDate.of(2001, Month.JANUARY, 1);
        LocalDate endDate = LocalDate.of(1999, Month.JANUARY, 1);

        LastDayOfYear.listYearHasLastDayIsMonday(startDate, endDate);

    }
}