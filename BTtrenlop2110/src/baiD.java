import java.util.*;

public class baiD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; ++i) a[i] = sc.nextInt();
            Map<Integer, Integer> freq = new HashMap<>();
            Map<Integer, Integer> firstIdx = new HashMap<>();
            for (int i = 0; i < n; ++i) {
                int v = a[i];
                freq.put(v, freq.getOrDefault(v, 0) + 1);
                firstIdx.putIfAbsent(v, i);
            }
            List<Integer> vals = new ArrayList<>(freq.keySet());
            vals.sort((x, y) -> {
                int fx = freq.get(x), fy = freq.get(y);
                if (fx != fy) return Integer.compare(fy, fx);
                return Integer.compare(firstIdx.get(x), firstIdx.get(y));
            });

            StringBuilder sb = new StringBuilder();
            boolean firstOut = true;
            for (int v : vals) {
                int times = freq.get(v);
                for (int k = 0; k < times; k++) {
                    if (!firstOut) sb.append(' ');
                    sb.append(v);
                    firstOut = false;
                }
            }
            System.out.println(sb.toString());
        }
        sc.close();
    }
}

