import java.util.*;

public class J01012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            int cnt = 0;
            if (n % 2 != 0) {
                System.out.println(0);
            }
            else {
                for (long i = 1; i * i <= n; ++i) {
                    if (n % i == 0) {
                        if (i % 2 == 0) ++cnt;
                        long j = n / i;
                        if (j != i && j % 2 == 0) ++cnt;
                    }
                }
                System.out.println(cnt);
            }
        }
        sc.close();
    }
}
