package main.recursion;

import recursion.CountX;

/**
 * Created by akash on 1/7/2017.
 */
public class MainCountX {
    public static void main(String[] args) {
        CountX countX = new CountX();
        System.out.println("Number of x in xxhixx is " + countX.countX("xxhixx"));
        System.out.println("Number of x in xhixhix is " + countX.countX("xhixhix"));
        System.out.println("Number of x in hi is " + countX.countX("hi"));
        System.out.println("Number of x in empty string is " + countX.countX(""));
    }
}
