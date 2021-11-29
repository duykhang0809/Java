package datesandtimes;

import org.junit.Assert;
import org.junit.Test;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;

public class NumberOfDayBetweenTwoDatesTest {

    @Test
    public void given_twoDates_when_theFirstDateIsBeforeTheSecondDate_then_returnTheirNumberOfDaysBetweenThem() {
        LocalDate startDate = LocalDate.of(1968, Month.JANUARY, 12);
        LocalDate endDate = LocalDate.of(1969, Month.SEPTEMBER, 19);
        long expected = 616;
        long actual = NumberOfDayBetweenTwoDates.numberOfDays(startDate, endDate);
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = DateTimeException.class)
    public void given_twoDates_when_theFirstDateIsAfterTheSecondDate_then_returnThrowDateTimeException() {
        LocalDate startDate = LocalDate.of(2000, Month.JANUARY, 12);
        LocalDate endDate = LocalDate.of(1969, Month.SEPTEMBER, 19);
        NumberOfDayBetweenTwoDates.numberOfDays(startDate, endDate);
    }

    @Test
    public void given_twoDates_when_theFirstDateIsTheSecondDate_then_returnTheirNumberOfDaysBetweenThem() {
        LocalDate startDate = LocalDate.of(1969, Month.JANUARY, 19);
        LocalDate endDate = LocalDate.of(1969, Month.JANUARY, 19);
        long expected = 0;
        long actual = NumberOfDayBetweenTwoDates.numberOfDays(startDate, endDate);
        Assert.assertEquals(expected, actual);
    }
}