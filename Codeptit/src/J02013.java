import java.util.*;

public class J02013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) a[i] = sc.nextInt();
        int step = 1;
        for (int i = 0; i < n - 1; ++i) {
            int check = 0;
            for (int j = 0; j < n - 1; ++j) {
                if (a[j + 1] < a[j]) {
                    check = 1;
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
            if (check == 1) {
                System.out.print("Buoc " + step++ + ": ");
                for (int j = 0; j < n; ++j) System.out.print(a[j] + " ");
                System.out.println();
            }
        }
        sc.close();
    }
}