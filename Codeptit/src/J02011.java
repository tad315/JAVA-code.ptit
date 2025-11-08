import java.util.*;

public class J02011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) a[i] = sc.nextInt();
        int step = 1;
        for (int i = 0; i < n - 1; ++i) {
            int check = i;
            for (int j = i + 1; j < n; ++j) {
                if (a[j] < a[check]) check = j;
            }
            int tmp = a[i];
            a[i] = a[check];
            a[check] = tmp;
            System.out.print("Buoc " + step++ + ": ");
            for (int j = 0; j < n; ++j) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
