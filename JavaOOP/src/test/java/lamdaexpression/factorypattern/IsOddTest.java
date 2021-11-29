package lamdaexpression.factorypattern;

import org.junit.Assert;
import org.junit.Test;

public class IsOddTest {

    @Test
    public void given_aNumber_when_itsValid_then_returnIsOddNumber(){
        int number = 5;
        boolean actual = new IsOdd().condition(number);
        Assert.assertTrue(actual);
    }

    @Test
    public void given_aNumber_when_itsValueIsMax_then_returnIsOddNumber(){
        int number = Integer.MAX_VALUE;
        boolean actual = new IsOdd().condition(number);
        Assert.assertTrue(actual);
    }

    @Test
    public void given_aNumber_when_itsValid_then_returnIsEvenNumber(){
        int number = 4;
        boolean actual = new IsOdd().condition(number);
        Assert.assertFalse(actual);
    }
}