package multithreading;

import org.junit.Assert;
import org.junit.Test;

public class SumCalculatorUsingThreadsTest {

    //Positive case
    @Test
    public void given_aNumberAndNumberOfThread_when_TheyAreValid_then_returnSumFromOneToIt() {
        int number = 5;
        int numberOfThread = 3;
        int expected = 15;
        int actual = SumCalculatorUsingThreads.calculateSum(number, numberOfThread);
        Assert.assertEquals(expected, actual);
    }

    //Negative case
    @Test(expected = IllegalArgumentException.class)
    public void given_aNumberAndNumberOfThread_when_numberOfThreadIsInvalid_then_throwIllegalArgumentException() {
        int number = 5;
        int numberOfThread = 0;
        SumCalculatorUsingThreads.calculateSum(number, numberOfThread);
    }
}