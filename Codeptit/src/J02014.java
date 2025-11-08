import java.util.*;

public class J02014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            long sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }
            long leftSum = 0, rightSum = 0;
            int idx = -1;
            for (int i = 0; i < n; i++) {
                rightSum = sum - leftSum - a[i];
                if (rightSum == leftSum) {
                    idx = i + 1;
                    break;
                }
                leftSum += a[i];
            }
            System.out.println(idx);
        }
        sc.close();
    }
}
