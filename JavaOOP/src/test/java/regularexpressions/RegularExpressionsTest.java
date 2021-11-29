package regularexpressions;

import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionsTest {

    @Test
    public void given_aString_when_itsValid_then_returnTrue() {
        boolean actual = RegularExpressions.isValidString("cool");
        assertTrue(actual);
    }

    @Test
    public void given_aString_when_itsValueIsInvalid_then_returnFalse() {
        boolean actual = RegularExpressions.isValidString("Cat");
        assertFalse(actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void given_aString_when_itsTypeIsInvalid_then_throwIllegalArgumentException() {
        RegularExpressions.isValidString("123");
    }
}