package baiA;
import java.util.*;
import java.io.*;

public class main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt(), i = sc.nextInt();
            int[][] arr = new int[n][m];
            for (int j = 0; j < n; ++j) {
                for (int k = 0; k < m; ++k) {
                    arr[j][k] = sc.nextInt();
                }
            }
            Matrix res = new Matrix(n, m, arr);
            res.sortCols(i);
            res.print();
        }
    }
}
