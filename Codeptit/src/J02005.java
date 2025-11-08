import java.io.*;
import java.util.*;

public class J02005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        for (int i = 0; i < n; ++i) a.add(sc.nextInt());
        for (int i = 0; i < m; ++i) b.add(sc.nextInt());

        List<Integer> res = new ArrayList<>();
        for (int x : a) {
            if (b.contains(x)) res.add(x);
        }
        Collections.sort(res);
        for (int i = 0; i < res.size(); ++i) {
            if (i > 0) System.out.print(" ");
            System.out.print(res.get(i));
        }
    }
}
