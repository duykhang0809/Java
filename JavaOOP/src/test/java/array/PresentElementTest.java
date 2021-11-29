package array;

import org.junit.Assert;
import org.junit.Test;

public class PresentElementTest {

    //Positive case
    @Test
    public void given_anElement_when_itsPresentInArray_then_returnSuccess() {
        int[] array = new int[]{1,2,3,4,5,6};
        Assert.assertTrue(PresentElement.isElementPresent(array, 4));
    }

    //Negative case
    @Test(expected = NullPointerException.class)
    public void given_anElement_when_arrayIsEmpty_then_throwNullPointerException() {
        int[] array = new int[]{};
        PresentElement.isElementPresent(array,3 );
    }

    //Edge case
    @Test
    public void given_anElement_when_itsNotPresentInArray_then_returnSuccess() {
        int[] array = new int[]{1,2,3,4,5,6};
        Assert.assertFalse(PresentElement.isElementPresent(array, 7));
    }
}