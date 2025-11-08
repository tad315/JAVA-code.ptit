import java.util.Scanner;

//3
//123456
//997
//111111111
public class J01004 {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        else if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; ++i) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; ++i) {
            int n = sc.nextInt();
            if (isPrime(n)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
