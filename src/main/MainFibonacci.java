package main;

import recursion.Fibonacci;

/**
 * Created by akash on 1/6/2017.
 */
public class MainFibonacci {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println("Fibonacci at 8th place is : " + fibonacci.getFibonacciAt(8));
    }
}
