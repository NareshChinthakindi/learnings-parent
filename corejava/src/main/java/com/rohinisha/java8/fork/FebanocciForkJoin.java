package com.rohinisha.java8.fork;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

public class FebanocciForkJoin extends RecursiveAction {
    private static final long threshold = 10;
    private volatile long number;

    public FebanocciForkJoin(long number) {
        this.number = number;
    }


    public long getNumber() {
        return number;
    }

    @Override
    protected void compute() {
        long n = number;
        if (n <= threshold) {
            number = fib(n);
        } else {
            FebanocciForkJoin f1 = new FebanocciForkJoin(n - 1);
            FebanocciForkJoin f2 = new FebanocciForkJoin(n - 2);
            ForkJoinTask.invokeAll(f1, f2);
            number = f1.number + f2.number;
        }
    }

    private static long fib(long n) {
        if (n <= 1) return n;
        else return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        FebanocciForkJoin task = new FebanocciForkJoin(11);
        new ForkJoinPool().invoke(task);

        System.out.println(task.getNumber());
    }
}
