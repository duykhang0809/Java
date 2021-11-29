package statements;

import junit.framework.Assert;
import org.junit.Test;

public class PalindromeStringTest{

    //Positive case
    @Test
    public void given_aPalindromeString_when_itsValueAndTypeIsValid_then_returnIsPalindrome() {
        boolean actual = PalindromeString.isPalindrome("hannah");
        Assert.assertTrue(actual);
    }

    //Edge case
    @Test
    public void given_aNotPalindromeString_when_itsValueAndTypeIsValid_then_returnIsPalindrome() {
        boolean actual = PalindromeString.isPalindrome("alex");
        Assert.assertFalse(actual);
    }

    //Negative case
    @Test(expected = IllegalArgumentException.class)
    public void given_aString_when_itsValueIsInValid_then_returnFail() {
        PalindromeString.isPalindrome("invalidValue123");
    }

}