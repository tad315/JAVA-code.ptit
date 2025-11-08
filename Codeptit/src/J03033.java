import java.math.BigInteger;
import java.util.Scanner;

public class J03033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while(t-- > 0) {
            BigInteger a = new BigInteger(sc.nextLine().trim());
            BigInteger b = new BigInteger(sc.nextLine().trim());
            BigInteger g = a.gcd(b);
            System.out.println(a.multiply(b).divide(g));
        }
    }
}
