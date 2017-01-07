package recursion;

/**
 * Created by akash on 1/7/2017.
 */
public class Power {

    /**
     * @param num the base
     * @param power the power
     * @return base ^ power
     */
    public int powerN(int num, int power) {
        if (power == 1) {
            return num;
        }
        return num * powerN(num, power - 1);
    }
}
