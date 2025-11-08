import java.util.Scanner;

public class J02106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][3];
        int res = 0;
        for (int i = 0; i < n; ++i) {
            int d1 = 0, d2 = 0;
            for (int j = 0; j < 3; ++j) {
                a[i][j] = sc.nextInt();
                if (a[i][j] == 1) ++d1;
                else ++d2;
            }
            if (d1 > d2) ++res;
        }
        System.out.print(res);
    }
}
