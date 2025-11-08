import java.util.*;
import java.math.BigInteger;

public class J03012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while (t-- > 0) {
            String x = sc.next();
            String y = sc.next();
            BigInteger a = new BigInteger(x);
            BigInteger b = new BigInteger(y);
            BigInteger sum = a.add(b);
            System.out.println(sum.toString());
        }
        sc.close();
    }
}
