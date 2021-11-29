package statements;

import junit.framework.Assert;
import org.junit.Test;

public class DecimalToBinaryTest {

    //Positive case
    @Test
    public void given_aDecimalNumber_when_itsValueIsValid_then_returnItsBinary() {
        String actual = DecimalToBinary.toBinary(6);
        String expected = "110";
        Assert.assertEquals(expected, actual);
    }

    //Negative case
    @Test(expected = ArithmeticException.class)
    public void given_aDecimalNumber_when_itsValueIsOverflow_then_returnFail() {
        DecimalToBinary.toBinary(Integer.MAX_VALUE + 1);
    }
}