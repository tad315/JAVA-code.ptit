import java.util.Scanner;

public class J01008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 1; test <= t; ++test) {
            long n= sc.nextLong();
            System.out.print("Test " + test + ": ");
            for (long i = 2; i * i <= n; ++i) {
                int cnt = 0;
                if (n % i == 0) {
                    while (n % i == 0) {
                        ++cnt;
                        n /= i;
                    }
                }
                if (cnt > 0) {
                    System.out.print(i + "(" + cnt + ") ");
                }
            }
            if (n > 1) {
                System.out.print(n + "(1)");
            }
            System.out.println();
        }
        sc.close();
    }
}
