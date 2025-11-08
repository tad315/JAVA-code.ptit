package baih;
import java.util.*;
public class Matrix {
    private int n, m;
    int[][] a;

    public Matrix(int n, int m, int[][] a) {
        this.n = n;
        this.m = m;
        this.a = a;
    }

    public void sortCol(int col) {
        int c = col - 1;
        Integer[] tmp = new Integer[n];
        for (int i = 0; i < n; ++i) {
            tmp[i] = a[i][c];
        }
        Arrays.sort(tmp);
        for (int i = 0; i < n; i++) {
            a[i][c] = tmp[i];
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                sb.append(a[i][j]);
                if (j < m - 1) sb.append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
