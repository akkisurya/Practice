package recursion;

/**
 * Created by akash on 1/6/2017.
 */
public class Factorial {

    public int calculate(int number) {
        if (number == 1) {
            return 1;
        }
        return number * calculate(--number);
    }
}
