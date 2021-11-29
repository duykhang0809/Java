package lamdaexpression.factorypattern;

import util.Validator;

import java.util.function.Supplier;

public class MainProgram {
    public static void main(String[] args) {
        Supplier<PerformOperationFactory> performOperationFactorySupplier = PerformOperationFactory::new;
        System.out.println("Enter number: ");
        int number = Validator.inputTypeInt();
        System.out.println("Is " + number + " odd ? " + performOperationFactorySupplier.get().getCondition("odd", number));

        System.out.println("Is " + number + " prime ? " + performOperationFactorySupplier.get().getCondition("prime", number));

        System.out.println("Is " + number + " palindrome ? " + performOperationFactorySupplier.get().getCondition("palindrome", number));
    }
}
