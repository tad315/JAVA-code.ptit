import java.io.*;
import java.util.*;

public class J02007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; ++i) {
            int n = sc.nextInt();
            LinkedHashMap<Integer, Integer> freq = new LinkedHashMap<>();
            for (int j = 0; j < n; ++j) {
                int x = sc.nextInt();
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }
            System.out.println("Test " + i + ":");
            for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
                System.out.println(e.getKey() + " xuat hien " + e.getValue() + " lan");
            }
        }
    }
}
