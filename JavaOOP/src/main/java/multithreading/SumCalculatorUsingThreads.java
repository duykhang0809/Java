package multithreading;

import util.Validator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SumCalculatorUsingThreads {

    public static void main(String[] args) {

        System.out.println("Enter N:");
        int number = Validator.inputTypeInt();

        System.out.println("Enter number of thread you want to use:");
        int numberOfThread = Validator.inputTypeInt();

        System.out.println("Sum of all number from 1 to " + number + " is " + calculateSum(number, numberOfThread));
    }

    static int calculateSum(int number, int numberOfThread) {
        if (numberOfThread < 1) throw new IllegalArgumentException();
        List<Future<Integer>> list = new ArrayList<>();

        ExecutorService executor = Executors.newFixedThreadPool(numberOfThread);
        Callable<Integer> callable;
        Future<Integer> future;
        for (int i = 1; i <= number; i++) {

            if (i + 1 > number) {
                callable = new SumCalculatorThread(i, 0);
            } else {
                callable = new SumCalculatorThread(i, ++i);
            }

            future = executor.submit(callable);

            list.add(future);
        }

        executor.shutdown();

        int sum = 0;
        for (Future<Integer> f : list) {
            try {
                sum += f.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Finished all threads");
        return sum;
    }
}