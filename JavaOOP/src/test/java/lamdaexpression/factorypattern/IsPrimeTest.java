package lamdaexpression.factorypattern;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsPrimeTest {

    @Test
    public void given_aNumber_when_itsValid_then_returnIsPrimeNumber() {
        int number = 7;
        boolean actual = new IsPrime().condition(number);
        Assert.assertTrue(actual);
    }

    @Test
    public void given_aNumber_when_itsValueIsMax_then_returnIsPrimeNumber() {
        int number = Integer.MAX_VALUE;
        boolean actual = new IsPrime().condition(number);
        Assert.assertTrue(actual);
    }

    @Test
    public void given_aNumber_when_itsValid_then_returnIsNotPrimeNumber() {
        int number = 10;
        boolean actual = new IsPrime().condition(number);
        Assert.assertFalse(actual);
    }
}