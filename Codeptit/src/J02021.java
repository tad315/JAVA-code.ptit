import java.util.*;

public class J02021 {
    static int n;
    static int k;
    static int[] comb;
    static int cnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        comb = new int[n];
        backTrack(1, 0);
        System.out.println();
        System.out.println("Tong cong co " + cnt + " to hop");
        sc.close();
    }
    public static void backTrack(int start, int idx) {
        if (idx == k) {
            ++cnt;
            for (int i = 0; i < k; ++i) {
                System.out.print(comb[i]);
            }
            System.out.print(" ");
            return;
        }
        for (int i = start; i <= n; ++i) {
            comb[idx] = i;
            backTrack(i + 1, idx + 1);
        }
    }
}
