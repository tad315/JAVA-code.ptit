import java.util.*;

public class J01014 {
    static long largestPrimeFactor(long n) {
        long ans = -1;
        while (n % 2 == 0) {
            ans = 2;
            n /= 2;
        }
        for (long i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                ans = i;
                n /= i;
            }
        }
        if (n > 1) ans = n;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            System.out.println(largestPrimeFactor(n));
        }
        sc.close();
    }
}
