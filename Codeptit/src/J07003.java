import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class J07003 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DATA.in"));
        BigInteger n = sc.nextBigInteger();
        while(true) {
            String s = n.toString();
            if (s.length() == 1) {
                break;
            }
            String s1 = s.substring(0, s.length()/2);
            String s2 = s.substring(s.length()/2);
            BigInteger n1 = new BigInteger(s1);
            BigInteger n2 = new BigInteger(s2);
            n = n1.add(n2);
            System.out.println(n);
        }
    }
}
