package recursion;

/**
 * Created by akash on 1/6/2017.
 * This class contains the getFibonacciAt method which returns the nth fibonacci number
 */
public class Fibonacci {
    public int getFibonacciAt(int num) {
        if (num == 1) {
            return 0;
        } else if (num == 2) {
            return 1;
        }
        return getFibonacciAt(num - 2) + getFibonacciAt(num - 1);
    }
}
