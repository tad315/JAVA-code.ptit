import java.util.*;

public class J02034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) a[i] = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        int maxVal = a[n - 1];
        for (int x : a) set.add(x);
        boolean miss = false;
        for (int i = 1; i <= maxVal; ++i) {
            if (!set.contains(i)) {
                System.out.println(i);
                miss = true;
            }
        }
        if (!miss) {
            System.out.println("Excellent!");
        }
        sc.close();
    }
}
