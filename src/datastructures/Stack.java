package datastructures;

import java.util.EmptyStackException;

/**
 * Created by akash on 1/6/2017.
 */
public class Stack<T> {
    private T[] arr;
    private int index = -1;

    public Stack() {
        arr = (T[]) new Object[100];
    }

    public Stack(int size) {
        arr = (T[]) new Object[100];
    }

    public void push(T val) {
        arr[++index] = val;
    }

    public T pop() {
        if (index == -1) {
            throw new EmptyStackException();
        }
        return arr[index--];
    }

    public T getTopElement() {
        return arr[index];
    }

    public int size() {
        return index + 1;
    }
}
