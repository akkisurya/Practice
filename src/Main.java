import datastructures.Stack;
import recursion.TowerOfHanoi;

/**
 * Created by akash on 1/6/2017.
 */
public class Main {
    public static void main(String[] args) {
        Stack<Integer> src = new Stack<>(100);
        src.push(5);
        src.push(4);
        src.push(3);
        src.push(2);
        src.push(1);

        TowerOfHanoi toh = new TowerOfHanoi(src);
        toh.build(src.size(), src, toh.getDest(), toh.getDest());
        System.out.println("Number of operations needed " + toh.getOperationsCount() );
        System.out.println("-------------------------------------------------------");
        while (toh.getDest().size() > 0) {
            System.out.println(toh.getDest().pop());
        }
    }
}
