import java.util.Scanner;

public class J01007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] fib = new long[93];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < 93; ++i) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        int t = sc.nextInt();
        while(t-- > 0) {
            long n = sc.nextLong();
            boolean ok = false;
            for (int i = 0; i < 93; ++i) {
                if (n == fib[i]) {
                    System.out.println("YES");
                    ok = true;
                    break;
                }
            }
            if (!ok) {
                System.out.println("NO");
            }
        }
    }
}
