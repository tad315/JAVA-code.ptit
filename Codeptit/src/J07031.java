import java.io.*;
import java.util.*;

public class J07031 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));

        ArrayList<Integer> a1 = (ArrayList<Integer>) ois1.readObject();
        ArrayList<Integer> a2 = (ArrayList<Integer>) ois2.readObject();

        ois1.close();
        ois2.close();

        Set<Integer> set2 = new HashSet<>(a2);
        Set<Integer> prime1 = new HashSet<>();
        for (int x : a1) {
            if (isPrime(x) && !set2.contains(x)) {
                prime1.add(x);
            }
        }

        ArrayList<int[]> res = new ArrayList<>();
        for (int x : prime1) {
            int m = 1_000_000 - x;
            if (m > x && prime1.contains(m)) {
                res.add(new int[]{x, m});
            }
        }

        res.sort(Comparator.comparingInt(x -> x[0]));
        for (int[] pair : res) {
            System.out.println(pair[0] + " " + pair[1]);
        }
    }
    private static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
