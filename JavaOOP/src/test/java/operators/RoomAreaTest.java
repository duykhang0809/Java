package operators;

import org.junit.Assert;
import org.junit.Test;

public class RoomAreaTest {

    @Test
    public void given_widthAndHeight_when_theirValuesAreValid_then_returnTheirArea() {
        double actual = RoomArea.getArea(2.0,8.0);
        double expected = 16.0;
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void given_number_when_isPositiveNumber_then_returnIsValidNumber(){
        boolean actual = RoomArea.isPositiveNumber(3.5);
        Assert.assertTrue(actual);
    }

    @Test
    public void given_number_when_isNegativeNumber_then_returnIsValidNumber(){
        boolean actual = RoomArea.isPositiveNumber(-3);
        Assert.assertFalse(actual);
    }
}