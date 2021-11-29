package lamdaexpression.factorypattern;

import java.util.stream.IntStream;

public class IsPalindrome implements PerformOperation {
    @Override
    public boolean condition(int number) {
       ICheckIsPalindrome checkIsPalindrome = (x -> x == IntStream.iterate(x, n -> n != 0, i -> i / 10)
                .map(n -> n % 10)
                .reduce(0, (a, b) -> a * 10 + b));
       return checkIsPalindrome.isPalindrome(number);
    }

    @FunctionalInterface
    public interface ICheckIsPalindrome {
        boolean isPalindrome(int number);
    }
}
