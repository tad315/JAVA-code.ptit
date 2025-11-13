import java.util.*;

public class J02023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();

        if ((s == 0 && n > 1) || (s > 9 * n)) {
            System.out.println("-1 -1");
            return;
        }

        if (s == 0 && n == 1) {
            System.out.println("0 0");
            return;
        }

        int sum = s;
        StringBuilder maxNum = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            int d = Math.min(9, sum);
            maxNum.append(d);
            sum -= d;
        }

        sum = s;
        StringBuilder minNum = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            int startDigit = (i == 0) ? 1 : 0;
            for (int d = startDigit; d <= 9; ++d) {
                int r = n - i - 1;
                int sPrime = sum - d;
                if (sPrime < 0) continue;
                if (sPrime <= 9 * r) {
                    minNum.append(d);
                    sum = sPrime;
                    break;
                }
            }
        }
        System.out.println(minNum.toString() + " " + maxNum.toString());
    }
}
