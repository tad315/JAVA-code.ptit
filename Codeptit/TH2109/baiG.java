import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class baiG {
    public static void main (String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DATA.in"));
        Set<BigInteger> set = new HashSet<>();
        while(sc.hasNext()) {
            set.add(new BigInteger(sc.next()));
        }
        BigInteger sum = BigInteger.ZERO;
        BigInteger mul = BigInteger.ONE;

        for (BigInteger x : set) {
            sum = sum.add(x);
            mul = mul.multiply(x);
        }
        System.out.println(sum);
        System.out.println(mul);
    }
}
