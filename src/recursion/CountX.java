package recursion;

/**
 * Created by akash on 1/7/2017.
 */
public class CountX {
    /*
    Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.

countX("xxhixx") → 4
countX("xhixhix") → 3
countX("hi") → 0
    * */
    public int countX(String str) {
        if (str.length() == 0) return 0;
        char lastChar = str.charAt(str.length() - 1);
        int xCount = lastChar == 'x' ? 1 : 0;
        return xCount + countX(str.substring(0, str.length() -1));
    }
}
