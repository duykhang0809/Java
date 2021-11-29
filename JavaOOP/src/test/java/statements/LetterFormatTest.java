package statements;


import org.junit.Assert;
import org.junit.Test;

import java.util.InputMismatchException;

public class LetterFormatTest{

    //Positive Case
    @Test
    public void given_aLetter_when_itsValueIsValid_then_returnItsType() {
        String actual = LetterFormat.getFormatLetter('c');
        String expected = "consonant";
        Assert.assertEquals(actual, expected);
    }

    //Negative Case
    @Test(expected = InputMismatchException.class)
    public void given_aLetter_when_itsValueIsInValid_then_returnFail() {
        LetterFormat.getFormatLetter('1');
    }

    //Positive Case
    @Test
    public void given_anYLetter_when_itsValueIsValid_then_returnItsType() {
        String actual = LetterFormat.getFormatLetter('y');
        String expected = "both";
        Assert.assertEquals(actual, expected);
    }
}