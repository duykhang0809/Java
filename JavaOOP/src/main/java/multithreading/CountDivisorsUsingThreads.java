package multithreading;

import util.Validator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CountDivisorsUsingThreads {

    public static void main(String[] args) {

        System.out.println("Enter N:");
        int number = Validator.inputTypeInt();

        System.out.println("Enter number of thread you want to use:");
        int numberOfThread = Validator.inputTypeInt();
        long startTime = System.currentTimeMillis();
        System.out.println("Largest number of divisors is " + findLargestNumberOfDivisors(number, numberOfThread));
        long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("Total elapsed time:  " + (elapsedTime / 1000.0) + " seconds.\n");
    }

    static int findLargestNumberOfDivisors(int number, int numberOfThread) {

        List<Future<Integer>> list = new ArrayList<>();
        ExecutorService executor = Executors.newFixedThreadPool(numberOfThread);
        Callable<Integer> callable;
        Future<Integer> future;
        List<Integer> listDivisors = new ArrayList<>();

        int maxDivisors = 1;
        int numberWithMax = 1;

        for (int i = 2; i <= number; i++) {
            int divisorCount = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisorCount++;
                }

            }
            if (divisorCount > maxDivisors) {
                maxDivisors = divisorCount;
                callable = new CountDivisorsThread(maxDivisors);
                future = executor.submit(callable);
                list.add(future);
                numberWithMax = i;
            }

        }

        for (int divisor = 1; divisor <= numberWithMax; divisor++) {
            if (numberWithMax % divisor == 0) listDivisors.add(divisor);
        }

        executor.shutdown();


        for (Future<Integer> f : list) {
            try {
                if (f.get() > maxDivisors) {
                    maxDivisors = f.get();
                }
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Finished all threads");
        System.out.println("Integer has largest number of divisors is " + numberWithMax);
        System.out.println("List divisors of " + numberWithMax + " is " + listDivisors);
        return maxDivisors;
    }
}