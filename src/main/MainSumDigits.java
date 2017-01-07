package main;

import recursion.SumDigits;

/**
 * Created by akash on 1/7/2017.
 */
public class MainSumDigits {
    public static void main(String[] args) {
        SumDigits sumDigits = new SumDigits();
        System.out.println("Sum of digits in 6 is " + sumDigits.sumDigits(6));
        System.out.println("Sum of digits in 146 is " + sumDigits.sumDigits(146));
        System.out.println("Sum of digits in 79 is " + sumDigits.sumDigits(79));
        System.out.println("Sum of digits in 1111 is " + sumDigits.sumDigits(1111));
        System.out.println("Sum of digits in 123456 is " + sumDigits.sumDigits(123456));
    }
}
