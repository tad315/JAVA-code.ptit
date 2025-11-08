import java.math.BigInteger;
import java.util.Scanner;

public class J03014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String y = sc.next();
        BigInteger a = new BigInteger(x);
        BigInteger b = new BigInteger(y);
        BigInteger sum = a.add(b);
        System.out.println(sum.toString());
        sc.close();
    }
}
