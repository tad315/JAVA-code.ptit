import java.io.*;
import java.util.*;

public class J07029 {
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) ois.readObject();
        ois.close();
        Map<Integer,Integer> freq = new HashMap<>();
        for (int x : a) {
            if (isPrime(x)) {
                freq.put(x,freq.getOrDefault(x,0)+1);
            }
        }
        ArrayList<Integer> primes = new ArrayList<>(freq.keySet());
        primes.sort(Collections.reverseOrder());
        for (int i = 0; i < 10; ++i) {
            int p = primes.get(i);
            System.out.println(p + " " + freq.get(p));
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
