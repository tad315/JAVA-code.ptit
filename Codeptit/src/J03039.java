import java.math.BigInteger;
import java.util.*;

public class J03039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);;
        int t = Integer.parseInt(sc.nextLine().trim());
        while(t-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            if (a.equals(BigInteger.ZERO) || b.equals(BigInteger.ZERO)) System.out.println("NO");
            else if (a.mod(b).equals(BigInteger.ZERO) || b.mod(a).equals(BigInteger.ZERO)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
