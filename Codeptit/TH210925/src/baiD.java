import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class baiD {
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;
        for (char c : s.toCharArray()) {
            if(!Character.isDigit(c)) return false;
        }
        return true;
    }
    public static void main (String[] args) throws Exception{
        Scanner sc = new Scanner (new File("DATA.in"));
        BigInteger intMax = BigInteger.valueOf(Integer.MAX_VALUE);
        BigInteger longMax = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger sum = BigInteger.ZERO;

        while(sc.hasNext()) {
            String line = sc.next();
            if (isNumber(line)) {
                BigInteger val = new BigInteger(line);
                if (val.compareTo(intMax) > 0 && val.compareTo(longMax) <= 0) {
                    sum = sum.add(val);
                }
            }
        }
        System.out.println(sum);
    }
}
