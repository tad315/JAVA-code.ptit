import java.io.*;
import java.util.*;

public class baiH {
    public static void main (String[] args) throws Exception {
        Scanner sc = new Scanner(new File ("MATRIX.in"));
        int t = Integer.parseInt(sc.nextLine().trim());
        while(t-- >0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int col = sc.nextInt();
            int[][] a = new int[n][m];
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < m; ++j) {
                    a[i][j] = sc.nextInt();
                }
            }
            Matrix mat = new Matrix(n, m, a)
            mat.sortCol(col);
            System.out.print(mat);
        }
    }
}
