import java.math.BigInteger;
import java.util.Scanner;

public class J03015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String y = sc.next();
        BigInteger a =  new BigInteger(x);
        BigInteger b = new BigInteger(y);
        System.out.print(a.subtract(b));
    }
}
