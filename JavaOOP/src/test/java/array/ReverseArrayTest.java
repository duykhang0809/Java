package array;

import org.junit.Assert;
import org.junit.Test;

public class ReverseArrayTest {

    //Positive Case
    @Test
    public void given_anArray_when_itsValid_then_reverseIt() {
        int[] array = new int[]{1,2,3,4,5};
        int[] expected = new int[]{5,4,3,2,1};
        int[] actual = ReverseArray.reverse(array, array.length);
        Assert.assertArrayEquals(expected, actual);
    }

    //Negative Case
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void given_aNullArray_when_itsValid_then_reverseIt() {
        int[] array = new int[]{1,2,3,4,5};
        ReverseArray.reverse(array, array.length+1);
    }
}