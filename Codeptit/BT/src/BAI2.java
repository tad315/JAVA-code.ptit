import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class BAI2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (new File ("DAYSO.in"));
        int n = sc.nextInt();
        BigInteger[] a = new BigInteger[n];
        for (int i = 0; i < n; ++i) {
            a[i] = sc.nextBigInteger();
        }
        BigInteger min = a[0];
        BigInteger max = a[0];
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < n; ++i) {
            if (a[i].compareTo(max) > 0) {
                max = a[i];
            }
            if (a[i].compareTo(min) < 0) {
                min = a[i];
            }
            sum = sum.add(a[i]);
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(sum);
    }
}

