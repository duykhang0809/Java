package array;

import org.junit.Assert;
import org.junit.Test;

public class AnagramStringTest {

    @Test
    public void given_twoStrings_when_theyAreAnagram_then_returnTrue() {
        String firstString = "Desperation";
        String secondString = "A Ropes End It";
        boolean actual = AnagramString.isAnagram(firstString,secondString);
        Assert.assertTrue(actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void given_twoStrings_when_theyAreInvalid_then_throwIllegalArgumentException() {
        String firstString = "Desperation";
        String secondString = "A Ropes End It1234";
        AnagramString.isAnagram(firstString,secondString);
    }

    @Test
    public void given_twoStrings_when_theyAreNotAnagram_then_returnFalse() {
        String firstString = "Desperation";
        String secondString = "A Rope End It";
        boolean actual = AnagramString.isAnagram(firstString,secondString);
        Assert.assertFalse(actual);
    }
}