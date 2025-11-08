import java.util.Scanner;

public class J03007 {
    public static boolean check (String num) {
        int l = 0, r = num.length() - 1;
        if (num.charAt(l) != '8' || num.charAt(r) != '8') return false;
        int sum = 0;
        while (l <= r) {
            char cl = num.charAt(l), cr = num.charAt(r);
            if (cl != cr) return false;
            ++l;
            --r;
            sum += ((cl - '0') + (cr - '0'));
        }
        if (sum % 10 != 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while (t-- > 0) {
            String num = sc.nextLine().trim();
            if (check(num)) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
