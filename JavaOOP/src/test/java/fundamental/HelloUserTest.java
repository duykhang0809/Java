package fundamental;

import org.junit.Assert;
import org.junit.Test;

public class HelloUserTest {

    @Test
    public void given_userName_when_itsValid_then_returnHelloUser() {
        String expected = "Hello Khang";
        String actual = HelloUser.helloUser("Khang");
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void given_userName_when_itContainsNumber_then_returnHelloUser() {
        HelloUser.helloUser("Kh1ang3");
    }

    @Test
    public void given_userName_when_itsBlankOrEmpty_then_returnFail() {
        boolean actual = HelloUser.isBlankString(" ");
        Assert.assertTrue(actual);
    }
}