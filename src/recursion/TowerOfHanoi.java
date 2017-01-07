package recursion;

import datastructures.Stack;

/**
 * Created by akash on 1/6/2017.
 */
public class TowerOfHanoi {
    private Stack<Integer> src;
    private Stack<Integer> dest;
    private Stack<Integer> temp;

    private int operationsCount = 0;

    public TowerOfHanoi(Stack<Integer> src) {
        this.src = src;
        this.dest = new Stack<>(src.size());
        this.temp = new Stack<>(src.size());
    }

    public Stack<Integer> getSrc() {
        return src;
    }

    public Stack<Integer> getDest() {
        return dest;
    }

    public Stack<Integer> getTemp() {
        return temp;
    }

    public int getOperationsCount() {
        return operationsCount;
    }

    public void build(int num, Stack<Integer> src, Stack<Integer> dest, Stack<Integer> temp) {
        if (num == 1) {
            dest.push(src.pop());
            operationsCount++;
            return;
        }
        build(num - 1, src, temp, dest);
        build(1, src, dest, temp);
        build(num - 1, temp, dest, src);
    }
}
