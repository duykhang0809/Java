package lamdaexpression.factorypattern;

import java.util.stream.IntStream;

public class IsPrime implements PerformOperation{
    @Override
    public boolean condition(int number) {
        ICheckIsPrime checkIsPrime = (x -> !IntStream.rangeClosed(2, x / 2).anyMatch(i -> x % i == 0));
        return checkIsPrime.isPrime(number);
    }

    @FunctionalInterface
    public interface ICheckIsPrime {
        boolean isPrime(int number);
    }

}
