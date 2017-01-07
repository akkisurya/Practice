package recursion;

/**
 * Created by akash on 1/7/2017.
 */
public class Count7 {
    /*
    *
Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

count7(717) → 2
count7(7) → 1
count7(123) → 0
    * */
    public int count7 (int num) {
        if (num < 10) return (num == 7) ? 1 : 0;
        return ((num % 10 == 7) ? 1 : 0) + count7(num / 10);
    }
}
