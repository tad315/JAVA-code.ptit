import java.util.Scanner;

public class J03024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while (t-- > 0) {
            String num =  sc.nextLine().trim();
            int c = 0, l = 0;
            boolean ok = false;
            for (int i = 0; i < num.length(); i++) {
                char ch = num.charAt(i);
                if (!Character.isDigit(ch))
                {
                    ok = true;
                }
                else if ((ch - '0') % 2 == 0) ++c;
                else ++l;
            }
            if (ok) System.out.println("INVALID");
            else {
                if ((c > l && num.length() % 2 == 0) || (l > c && num.length() % 2 != 0)) System.out.println("YES");
                else System.out.println("NO");
            }

        }
    }
}
