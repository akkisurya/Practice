package main.recursion;

import recursion.Count8;

/**
 * Created by akash on 1/7/2017.
 */
public class MainCount8 {
    public static void main(String[] args) {
        Count8 count8 = new Count8();
        System.out.println("The number of 8s in 8 :" + count8.count8(8));
        System.out.println("The number of 8s in 0 :" + count8.count8(0));
        System.out.println("The number of 8s in 8818 :" + count8.count8(8818));
        System.out.println("The number of 8s in 1818188 :" + count8.count8(1818188));
        System.out.println("The number of 8s in 88888 :" + count8.count8(88888));
    }
}
