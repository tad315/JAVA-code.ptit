import java.util.*;

public class J03023 {
    public static int Val (char s) {
        switch (s) {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            default: return 1000;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine().trim();
            int n = s.length();
            int res = 0;
            for (int i = 0; i < n; i++) {
                int v = Val(s.charAt(i));
                if (i + 1 < n && v < Val(s.charAt(i + 1))) {
                    res -= v;
                }
                else res += v;
            }
            System.out.println(res);
        }
    }
}
