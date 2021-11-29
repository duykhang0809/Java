package multithreading;

import java.util.concurrent.Callable;

public class CountDivisorsThread implements Callable<Integer> {

    private int number;

    public CountDivisorsThread(int number){
        this.number = number;
    }


    public Integer call(){
        System.out.println("Thread " + Thread.currentThread().getName() + " get " + number);
        return number;
    }
}
