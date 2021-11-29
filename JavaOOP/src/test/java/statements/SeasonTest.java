package statements;

import junit.framework.Assert;
import org.junit.Test;

public class SeasonTest{

    //Positive Case
    @Test
    public void given_monthAndDay_when_theirValuesAndTypesAreValid_then_returnSeason() {
        String actual = Season.getSeason("january", 28);
        String expected = "winter";
        Assert.assertEquals(expected, actual);
    }

    //Negative Case
    @Test(expected = IllegalArgumentException.class)
    public void given_monthAndDay_when_monthValueIsInvalid_then_returnFail() {
        Season.getSeason("invalidMonth", 28);
    }

    //Negative Case
    @Test(expected = NumberFormatException.class)
    public void given_monthAndDay_when_dayValueIsInvalid_then_returnFail() {
        Season.getSeason("january", 32);
    }
}