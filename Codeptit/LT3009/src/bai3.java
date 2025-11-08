import java.util.*;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            TreeSet<Integer> c = new TreeSet<>();
            TreeSet<Integer> l = new TreeSet<>(Collections.reverseOrder());
            for (int i = 0; i < n; ++i) {
                int x = sc.nextInt();
                if (x % 2 == 0) c.add(x);
                else l.add(x);
            }
            for (int x : c) System.out.print(x + " ");
            System.out.println();
            for (int x : l) System.out.print(x + " ");
            System.out.println();
        }
    }
}
