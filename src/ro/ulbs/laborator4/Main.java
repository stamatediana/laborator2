//problema1
package ro.ulbs.laborator4;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            x.add(rand.nextInt(11));
        }
        for (int i = 0; i < 7; i++) {
            y.add(rand.nextInt(11));
        }
        Collections.sort(x);
        Collections.sort(y);

        //a)
        List<Integer> xPlusY = new ArrayList<>(x);
        xPlusY.addAll(y);
        Collections.sort(xPlusY);

        // b)
        Set<Integer> zSet = new TreeSet<>(x);
        zSet.retainAll(y);

        // c)
        List<Integer> xMinusY = new ArrayList<>(x);
        xMinusY.removeAll(y);

        // d)
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList<>();
        for (int num : xPlusY) {
            if (num <= p) {
                xPlusYLimitedByP.add(num);
            }
        }
        System.out.println("Lista x: " + x);
        System.out.println("Lista y: " + y);
        System.out.println("xPlusY (x + y): " + xPlusY);
        System.out.println("zSet (valori comune): " + zSet);
        System.out.println("xMinusY (x - y): " + xMinusY);
        System.out.println("xPlusYLimitedByP (elemente <= p): " + xPlusYLimitedByP);
    }
}
