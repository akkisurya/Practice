package main;

import recursion.Triangle;

/**
 * Created by akash on 1/7/2017.
 */
public class MainTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println("Total blocks in a traingle of 7 blocks is " + triangle.triangle(7));
    }
}
