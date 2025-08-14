import java.util.*;

public class J01010 {
    public static char cut(char d) {
        switch (d) {
            case '0':
                return '0';
            case '1':
                return '1';
            case '8':
                return '0';
            case '9':
                return '0';
            default:
                return '\0';
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while (t-- > 0) {
            String s = sc.nextLine().trim();
            StringBuilder sb = new StringBuilder();
            boolean ok = true;
            for (int i = 0; i < s.length(); ++i) {
                char c = cut(s.charAt(i));
                if (c == '\0') {
                    ok = false;
                    break;
                }
                sb.append(c);
            }
            if (!ok) {
                System.out.println("INVALID");
                continue;
            }
            int idx = 0;
            while (idx < sb.length() && sb.charAt(idx) == '0') ++idx;
            if (idx == sb.length()) {
                System.out.println("INVALID");
            }
            else {
                System.out.println(sb.substring(idx));
            }
        }
        sc.close();
    }
}
