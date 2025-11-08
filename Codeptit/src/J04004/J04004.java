package J04004;
import java.util.*;

public class J04004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tu1 = sc.nextLong();
        long mau1 = sc.nextLong();
        long tu2 = sc.nextLong();
        long mau2 = sc.nextLong();

        sumPS p = new sumPS(tu1, mau1);
        sumPS q = new sumPS(tu2, mau2);

        sumPS sum = p.add(q);
        System.out.println(sum);
    }
}
