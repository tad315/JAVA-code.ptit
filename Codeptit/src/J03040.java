import java.util.*;

public class J03040 {
    public static boolean isBeautifull (String s) {
        String digitsOnly = s.replaceAll("[^0-9]", "");
        String digits = digitsOnly.substring(digitsOnly.length() - 5);
        boolean inc = true;
        for (int i = 0; i < 4; i++) {
            if (!(digits.charAt(i) < digits.charAt(i + 1))) {
                inc = false;
                break;
            }
        }
        if (inc) return true;

        boolean eQual = true;
        for (int i = 0; i < 4; ++i) {
            if (!(digits.charAt(i) == digits.charAt(i + 1))) {
                eQual = false;
                break;
            }
        }
        if (eQual) return true;

        if (digits.charAt(0) == digits.charAt(1) && digits.charAt(1) == digits.charAt(2) && digits.charAt(3) == digits.charAt(4)) {
            return true;
        }

        boolean lucky = true;
        for (char c : digits.toCharArray()) {
            if (c != '6' && c != '8') {
                lucky = false;
                break;
            }
        }
        if (lucky) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while (t-- > 0) {
            String s = sc.nextLine().trim();
            if (isBeautifull(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
