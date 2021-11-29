package array;

import org.junit.Assert;
import org.junit.Test;

public class RemoveElementTest {

    //Positive case
    @Test
    public void given_elementIndexToRemoveItFromArray_when_itsValid_then_returnNewArray() {
        int[] array = new int[]{1,2,3,4,5,6};
        int[] expected = new int[]{1,2,3,4,6};
        int[] actual = RemoveElement.removeElement(array, 4);
        Assert.assertArrayEquals(expected, actual);
    }

    //Negative case
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void given_elementIndexToRemoveItFromArray_when_itsGreaterThanArrayLength_then_returnArrayIndexOutOfBoundsException() {
        int[] array = new int[]{1,2,3,4,5,6};
        RemoveElement.removeElement(array, 9);
    }

    //Edge case
    @Test
    public void given_elementIndexToRemoveItFromArray_when_itsValueIsEdge_then_returnNewArray() {
        int[] array = new int[]{1,2,3,4,5,6};
        int[] expected = new int[]{1,2,3,4,5};
        int[] actual = RemoveElement.removeElement(array, array.length-1);
        Assert.assertArrayEquals(expected, actual);
    }
}