package operators;

import org.junit.Assert;
import org.junit.Test;

public class SumToNTest {

    @Test
    public void given_number_when_itsValueIsValid_then_returnSumFromOneToIt() {
        int actual = SumToN.sum(5);
        int expected = 15;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void given_number_when_itsValueIsGreaterThanOne_then_returnIsValidNumber() {
        boolean actual = SumToN.isGreaterThanOne(2);
        Assert.assertTrue(actual);
    }

    @Test
    public void given_number_when_itsValueIsSmallerThanOne_then_returnIsValidNumber() {
        boolean actual = SumToN.isGreaterThanOne(0);
        Assert.assertFalse(actual);
    }
}