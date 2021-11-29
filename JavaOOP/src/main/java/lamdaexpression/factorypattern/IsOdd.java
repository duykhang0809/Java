package lamdaexpression.factorypattern;


public class IsOdd implements PerformOperation {

    @Override
    public boolean condition(int number) {
        ICheckIsOdd checkIsOdd = (x -> x % 2 != 0);
        return checkIsOdd.isOdd(number);
    }

    @FunctionalInterface
    public interface ICheckIsOdd {
        boolean isOdd(int number);
    }
}
