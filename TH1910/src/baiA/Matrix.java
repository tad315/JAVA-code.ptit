package baiA;
import java.util.*;

public class Matrix {
    private int n, m;
    private int[][] arr;
    public Matrix(int n, int m, int[][] arr){
        this.n = n;
        this.m = m;
        this.arr = arr;
    }
    public void sortCols(int i) {
        int j = i - 1;
        Integer[] tmp = new Integer[n];
        if (j < 0 || j >= m) return;
        for (int k = 0; k < n; ++k) tmp[k] = arr[k][j];
        Arrays.sort(tmp);
        for (int k = 0; k < n; ++k) arr[k][j] = tmp[k];
    }
    public void print() {
        for (int j = 0; j < n; ++j) {
            for (int k = 0; k < m; ++k) {
                System.out.print(arr[j][k] + " ");
            }
            System.out.println();
        }
    }
}
