package operators;

import junit.framework.Assert;
import org.junit.Test;

public class MathFunctionTest {

    //Sum Positive Case
    @Test
    public void given_twoNumber_when_theirTypesAreInt_then_returnTheirSum() {
        int actual = MathFunction.sum(2, 1);
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }

    //Sum Negative Case
    @Test(expected = ArithmeticException.class)
    public void given_twoNumber_when_theirSumAreOverflow_then_throwArithmeticExceptionSum() {
        MathFunction.sum(Integer.MAX_VALUE, 1);
    }

    //Sum Edge Case
    @Test
    public void given_twoNumber_when_theirValueAreEdge_then_returnTheirSum() {
        int actual = MathFunction.sum(Integer.MAX_VALUE, Integer.MIN_VALUE);
        int expected = -1;
        Assert.assertEquals(expected, actual);
    }

    //Diff Positive Case
    @Test
    public void given_twoNumber_when_theirTypesAreInt_then_returnTheirDif() {
        int actual = MathFunction.dif(8,2);
        int expected = 6;
        Assert.assertEquals(expected, actual);
    }

    //Diff Negative Case
    @Test(expected = ArithmeticException.class)
    public void given_twoNumber_when_theirDiffAreOverflow_then_throwArithmeticExceptionDiff() {
        MathFunction.dif(Integer.MIN_VALUE, 1);
    }

    //Diff Edge Case
    @Test
    public void given_twoNumber_when_theirValueAreEdge_then_returnTheirDiff() {
        int actual = MathFunction.dif(Integer.MIN_VALUE, -1);
        int expected = Integer.MIN_VALUE+1;
        Assert.assertEquals(expected, actual);
    }

    //Multi Positive Case
    @Test
    public void given_twoNumber_when_theirTypesAreInt_then_returnTheirMultiple() {
        int actual = MathFunction.multiply(8,2);
        int expected = 16;
        Assert.assertEquals(expected, actual);
    }

    //Multi Negative Case
    @Test(expected = ArithmeticException.class)
    public void given_twoNumber_when_theirMultiAreOverflow_then_throwArithmeticExceptionMulti() {
        MathFunction.multiply(Integer.MAX_VALUE, 2);
    }


    //Quotient Positive Case
    @Test
    public void given_twoNumber_when_theirTypesAreInt_then_returnTheirQuotient() {
        int actual = MathFunction.divide(12, 4);
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }

    //Quotient Negative Case
    @Test(expected = ArithmeticException.class)
    public void given_twoNumber_when_secondNumberIsZero_then_throwArithmeticExceptionQuotient() {
        MathFunction.divide(12, 0);
    }

    //Remainder Positive Case
    @Test
    public void given_twoNumber_when_theirTypesAreInt_then_returnTheirRemainder() {
        int actual = MathFunction.divideWithRemainder(13, 4);
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    //Remainder Negative Case
    @Test(expected = ArithmeticException.class)
    public void given_twoNumber_when_secondNumberIsZero_then_throwArithmeticExceptionRemainder() {
        MathFunction.divideWithRemainder(12, 0);
    }

    //Power Positive Case
    @Test
    public void given_twoNumber_when_theirTypesAreInt_then_returnTheirPower() {
        double actual = MathFunction.pow(10, 2);
        double expected = 100D;
        Assert.assertEquals(expected, actual);
    }

}