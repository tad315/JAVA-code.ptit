import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class bai4 {
    public static void main (String[] args) throws Exception {
        Scanner sc = new Scanner(new File ("DATA.in"));
        //Scanner sc = new Scanner(System.in);
        Set<BigInteger> set = new HashSet<>();
        while (sc.hasNext()) {
            set.add(sc.nextBigInteger());
        }
        BigInteger s = BigInteger.ZERO;
        BigInteger p = BigInteger.ONE;
        for (BigInteger x : set) {
            s = s.add(x);
            p = p.multiply(x);
        }
        System.out.println(s);
        System.out.println(p);
    }
}
