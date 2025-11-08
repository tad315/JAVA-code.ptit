import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class J02008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            BigInteger lcm = BigInteger.ONE;
            for (int i = 2; i <= n; ++i) {
                BigInteger bi = BigInteger.valueOf(i);
                lcm = lcm.multiply(bi).divide(lcm.gcd(bi));
            }
            sb.append(lcm).append("\n");
        }
        System.out.print(sb.toString());
    }
}
