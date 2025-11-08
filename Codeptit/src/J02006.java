import java.io.*;
import java.util.*;

public class J02006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        Set<Integer> U = new HashSet<>();
        for (int i = 0; i < n; ++i) U.add(sc.nextInt());
        for (int i = 0; i < m; ++i) U.add(sc.nextInt());

        List<Integer> res = new ArrayList<>(U);
        Collections.sort(res);

        for (int i = 0; i < res.size(); ++i) {
            if (i > 0) System.out.print(" ");
            System.out.print(res.get(i));
        }
    }
}
