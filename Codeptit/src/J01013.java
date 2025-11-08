import java.util.*;

public class J01013 {
    static int MAX = 2000000;
    static int[] spf = new int[MAX + 1];
    static long[] prefix = new long[MAX + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sieveSPF();
        pre();
        long sum = 0;
        while (n-- > 0) {
            int x = sc.nextInt();
            sum += prefix[x];
        }
        System.out.print(sum);
        sc.close();
    }

    static void sieveSPF() {
        for (int i = 2; i <= MAX; ++i) {
            if (spf[i] == 0) {
                spf[i] = i;
                if ((long) i * i <= MAX) {
                    for (int j = i * i; j <= MAX; j += i) {
                        if (spf[j] == 0) spf[j] = i;
                    }
                }
            }
        }
    }

    static void pre() {
        prefix[1] = 0;
        for (int i = 2; i <= MAX; ++i) {
            prefix[i] = prefix[i / spf[i]] + spf[i];
        }
    }
}
