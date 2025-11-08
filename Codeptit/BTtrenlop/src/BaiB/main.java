package BaiB;
//Danh sach canh - Su dung lop pair (generic)
import java.util.*;
import java.io.*;

public class main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] a = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (a[i][j] == 1) {
                    System.out.println(new Pair<Integer, Integer>(i + 1, j + 1));
                }
            }
        }
    }
}

