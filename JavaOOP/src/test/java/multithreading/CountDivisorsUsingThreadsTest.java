package multithreading;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountDivisorsUsingThreadsTest {

    @Test
    public void given_aNumberAndNumberOfThread_when_TheyAreValid_then_returnMaxDivisorsFromNumber() {
        int number = 1000;
        int numberOfThread = 10;
        int expected = 32;
        int actual = CountDivisorsUsingThreads.findLargestNumberOfDivisors(number, numberOfThread);
        Assert.assertEquals(expected, actual);
    }

    //Negative case
    @Test(expected = IllegalArgumentException.class)
    public void given_aNumberAndNumberOfThread_when_numberOfThreadIsInvalid_then_throwIllegalArgumentException() {
        int number = 1000;
        int numberOfThread = 0;
        CountDivisorsUsingThreads.findLargestNumberOfDivisors(number, numberOfThread);
    }
}