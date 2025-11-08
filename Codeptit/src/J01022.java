import java.io.*;
import java.util.*;

public class J01022 {
    static long[] len = new long[93];

    static char findChar(int n, long k) {
        if (n == 1) return '0';
        if (n == 2) return '1';
        if (k <= len[n - 2]) {
            return findChar(n - 2, k);
        }
        else {
            return findChar(n - 1, k - len[n - 2]);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        len[1] = 1;
        len[2] = 1;
        for (int i = 3; i < 93; ++i) {
            len[i] = len[i - 1] + len[i - 2];
        }
        StringBuilder out = new StringBuilder();
        while(t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            out.append(findChar(n, k)).append("\n");
        }
        System.out.println(out.toString());
    }
}
