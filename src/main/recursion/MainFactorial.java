package main.recursion;

import recursion.Factorial;

/**
 * Created by akash on 1/6/2017.
 */
public class MainFactorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println("Factorial of 5 is : " + factorial.calculate(5));
    }
}
