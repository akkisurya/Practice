package main.recursion;

import recursion.Count7;

/**
 * Created by akash on 1/7/2017.
 */
public class MainCount7 {
    public static void main(String[] args) {
        Count7 count7 = new Count7();
        System.out.println("Number of 7s in 717 : " + count7.count7(717));
        System.out.println("Number of 7s in 771237 : " + count7.count7(771237));
        System.out.println("Number of 7s in 47571 : " + count7.count7(47571));
        System.out.println("Number of 7s in 99999 : " + count7.count7(99999));
        System.out.println("Number of 7s in 7 : " + count7.count7(7));
    }
}
