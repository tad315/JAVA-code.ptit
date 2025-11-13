import java.util.*;

public class J02016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; ++i){
                long x = sc.nextLong();
                a[i] = x * x;
            }
            Arrays.sort(a);
            boolean ok = false;
            for (int k = n - 1; k >= 2; k--) {
                int i = 0, j = k - 1;
                while (i < j) {
                    if (a[i] + a[j] == a[k]) {
                        ok = true;
                        break;
                    }
                    else if (a[i] + a[j] < a[k]) ++i;
                    else --j;
                }
                if (ok) break;
            }
            System.out.println(ok ? "YES" : "NO");
        }
    }
}
