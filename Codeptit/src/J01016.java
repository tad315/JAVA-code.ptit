import java.util.*;

public class J01016 {
    static int cnt4 (long n) {
        int cnt = 0;
        while (n > 0) {
            if (n % 10 == 4) ++cnt;
            n /= 10;
        }
        return cnt;
    }
    static int cnt7 (long n) {
        int cnt = 0;
        while (n > 0) {
            if (n % 10 == 7) ++cnt;
            n /= 10;
        }
        return cnt;
    }
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (cnt4(n) + cnt7(n) == 4 || cnt4(n) + cnt7(n) == 7) {
            System.out.println("YES");
        }
        else System.out.println("NO");
        sc.close();
    }
}
