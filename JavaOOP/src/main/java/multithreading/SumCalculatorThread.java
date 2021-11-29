package multithreading;

import java.util.concurrent.Callable;

public class SumCalculatorThread implements Callable<Integer> {

    private int number;
    private int nextNumber;

    public SumCalculatorThread(int number, int nextNumber) {
        this.number = number;
        this.nextNumber = nextNumber;
    }

    public Integer call() {
        if (nextNumber == 0) {
            System.out.println("Thread " + Thread.currentThread().getName() + " get " + number);
            return number;
        }

        System.out.println("Thread " + Thread.currentThread().getName() + " get " + number + " and " + nextNumber + " = " + (number + nextNumber));
        return number + nextNumber;
    }
}
