import java.util.*;
import java.math.BigInteger;

public class J03016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-->0) {
            BigInteger a = sc.nextBigInteger();
            if (a.mod(BigInteger.valueOf(11)).equals(BigInteger.ZERO)){
                System.out.println(1);
            }
            else System.out.println(0);
        }
    }
}
