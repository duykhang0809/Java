package oop.exercise1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {

    @Test
    public void given_anAmount_when_itsValid_then_returnDepositIt() {
        long balance = 300000;
        Account account = new Account("Title", balance);
        long expected = 350000;
        long actual = account.deposit(50000);
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = NumberFormatException.class)
    public void given_anAmount_when_itsSmallerThan0_then_throwNumberFormatException() {
        long balance = 300000;
        Account account = new Account("Title", balance);
        account.deposit(-50000);
    }


    @Test
    public void given_anAmount_when_itsValid_then_returnWithdrawalIt() {
        long balance = 300000;
        Account account = new Account("Title", balance);
        long expected = 250000;
        long actual = account.withdrawal(50000);
        Assert.assertEquals(expected, actual);
    }


    @Test(expected = NumberFormatException.class)
    public void given_anAmount_when_itsGreaterThanBalance_then_throwNumberFormatException() {
        long balance = 300000;
        Account account = new Account("Title", balance);
        account.withdrawal(350000);
    }
}