import java.io.*;
import java.util.*;

public class J07015 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> a;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"))) {
            a = (ArrayList<Integer>) ois.readObject();
        }

        TreeMap<Integer, Integer> freq = new TreeMap<>();
        for (int x : a) {
            if (isPrime(x)) {
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
