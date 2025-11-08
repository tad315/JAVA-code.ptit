package J04003;
import java.util.*;
import java.math.BigInteger;

public class J04003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger tu = new BigInteger(sc.next());
        BigInteger mau = new BigInteger(sc.next());

        PS f = new PS(tu, mau);
        System.out.println(f);
    }
}
