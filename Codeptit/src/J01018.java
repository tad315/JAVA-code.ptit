import java.util.*;

public class J01018 {
    public static int getSum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); ++i) {
            sum += s.charAt(i) - '0';
        }
        return sum;
    }

    public static boolean check(String s) {
        for (int i = 0; i < s.length() - 1; ++i) {
            int a = s.charAt(i) - '0';
            int b = s.charAt(i + 1) - '0';
            if (Math.abs(a - b) != 2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while(t-- > 0) {
            String s = sc.nextLine().trim();
            if (getSum(s) % 10 == 0 && check(s)) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
