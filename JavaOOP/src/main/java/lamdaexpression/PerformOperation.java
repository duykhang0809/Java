package lamdaexpression;


import util.Validator;

import java.util.stream.IntStream;


public class PerformOperation {

    @FunctionalInterface
    public interface ICheckIsOdd {
        boolean isOdd(int number);
    }

    @FunctionalInterface
    public interface ICheckIsPrime {
        boolean isPrime(int number);
    }

    @FunctionalInterface
    public interface ICheckIsPalindrome {
        boolean isPalindrome(int number);
    }

    public static void main(String[] args) {

        System.out.println("Enter your number:");
        int yourNumber = Validator.inputTypeInt();

        ICheckIsOdd checkIsOdd = (number -> number % 2 != 0);
        System.out.println("Is " + yourNumber + " is odd ? " + checkIsOdd.isOdd(yourNumber));

        ICheckIsPrime checkIsPrime = (number -> !IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0));
        System.out.println("Is " + yourNumber + " is prime ? " + checkIsPrime.isPrime(yourNumber));

        ICheckIsPalindrome checkIsPalindrome = (number -> number == IntStream.iterate(number, n -> n != 0, i -> i / 10)
                .map(n -> n % 10)
                .reduce(0, (a, b) -> a * 10 + b));
        System.out.println("Is " + yourNumber + " is palindrome ? " + checkIsPalindrome.isPalindrome(yourNumber));
    }


}
