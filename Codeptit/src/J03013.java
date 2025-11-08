import java.math.BigInteger;
import java.util.Scanner;

public class J03013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String x = sc.next();
            String y = sc.next();
            BigInteger a = new BigInteger(x);
            BigInteger b = new BigInteger(y);
            BigInteger diff = a.subtract(b).abs();
            int len = Math.max(x.length(), y.length());
            String res = diff.toString();
            while (res.length() < len) {
                res = "0" + res;
            }
            System.out.println(res);
        }
        sc.close();
    }
}
