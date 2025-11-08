import java.util.*;

public class J03025 {
    public static boolean check (String s) {
        int l = 0, r = s.length() - 1, cnt = 0;
        while(l < r) {
            if (s.charAt(l) != s.charAt(r)) ++cnt;
            ++l;
            --r;
        }
        if (cnt == 1) return true;
        if (cnt == 0 && s.length() % 2 == 1) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while(t-- > 0) {
            String s = sc.nextLine().trim();
            if (check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
