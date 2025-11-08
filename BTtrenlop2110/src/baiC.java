import java.util.*;

public class baiC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Queue<Long> q = new ArrayDeque<>();
            int cnt = 0;
            q.add(4L);
            q.add(5L);
            ArrayList<String> a = new ArrayList<>();
            while (true) {
                long x = q.peek();
                q.poll();
                cnt++;
                StringBuilder s = new StringBuilder(String.valueOf(x));
                String tmp1 = s.toString();
                String tmp = s.reverse().toString();
                a.add(tmp1 + tmp);
                if (cnt == n)
                    break;
                q.add(x * 10 + 4);
                q.add(x * 10 + 5);
            }
            for (String x : a) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}