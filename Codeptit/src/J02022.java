import java.util.*;

public class J02022 {
    static int n;
    static ArrayList<String> res = new ArrayList<>();
    static boolean[] used;
    static int[] a;

    static void backTrack(int idx) {
        if (idx == n) {
            for (int i = 0; i < n - 1; ++i)
            {
                if (Math.abs(a[i] - a[i + 1]) == 1) return;
            }
            StringBuilder sb = new StringBuilder();
            for (int x : a) sb.append(x);
            res.add(sb.toString());
            return;
        }
        for (int d = 1; d <= n; ++d) {
            if (!used[d]) {
                used[d] = true;
                a[idx] = d;
                backTrack(idx + 1);
                used[d] = false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            n = Integer.parseInt(sc.nextLine());
            res.clear();
            used = new boolean[n + 1];
            a = new int[n];
            backTrack(0);
            Collections.sort(res);
            for(String s : res) {
                System.out.println(s);
            }
            System.out.println();
        }
    }
}
