import java.util.Scanner;

public class J03006 {
    public static boolean check(String num) {
        int l = 0, r = num.length() - 1;
        while (l <= r) {
            char cl = num.charAt(l), cr = num.charAt(r);
            if ((cl - '0') % 2 != 0 || (cr - '0') % 2 != 0) return false;
            if (cl != cr) return false;
            ++l;
            --r;
        }
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
