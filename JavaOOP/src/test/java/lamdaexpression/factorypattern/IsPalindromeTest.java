package lamdaexpression.factorypattern;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsPalindromeTest {

    @Test
    public void given_aNumber_when_itsValid_then_returnIsPalindromeNumber() {
        int number = 121;
        boolean actual = new IsPalindrome().condition(number);
        Assert.assertTrue(actual);
    }

    @Test
    public void given_aNumber_when_itsValueIsMax_then_returnIsNotPalindromeNumber() {
        int number = Integer.MAX_VALUE;
        boolean actual = new IsPalindrome().condition(number);
        Assert.assertFalse(actual);
    }

    @Test
    public void given_aNumber_when_itsValid_then_returnIsNotPalindromeNumber() {
        int number = 100;
        boolean actual = new IsPalindrome().condition(number);
        Assert.assertFalse(actual);
    }
}