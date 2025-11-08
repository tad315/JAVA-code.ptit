import java.util.*;

public class J02020 {
    static int n, k;
    static int[] comb;
    static int cnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        comb = new int[k];
        backTrack(1, 0);
        System.out.println("Tong cong co " + cnt + " to hop");
    }
    public static void backTrack(int start, int idx) {
        if (idx == k) {
            for (int i = 0; i < k; ++i) {
                System.out.print(comb[i] + " ");
            }
            System.out.println();
            ++cnt;
            return;
        }
        for (int i = start; i <= n; ++i) {
            comb[idx] = i;
            backTrack(i + 1, idx + 1);
        }

    }
}
