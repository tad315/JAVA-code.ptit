import java.io.*;
import java.util.*;

public class J02004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder out = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            long[] a = new long[n];
            for (int i = 0; i < n; ++i) {
                a[i] = Long.parseLong(st.nextToken());
            }
            boolean ok = true;
            for (int i = 0; i < n / 2; ++i) {
                if (a[i] != a[n - i - 1]) {
                    ok = false;
                    break;
                }
            }
            out.append(ok ? "YES" : "NO").append("\n");
        }
        System.out.print(out.toString());
    }
}
