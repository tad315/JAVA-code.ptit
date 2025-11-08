import java.util.Scanner;

public class J03021 {
    public static boolean check (String num) {
        int l = 0, r = num.length()-1;
        while(l <= r) {
            if (num.charAt(l) !=  num.charAt(r)) return false;
            ++l;
            --r;
        }
        return true;
    }

    public static String getNum (String line) {
        String num = "";
        line = line.toLowerCase();
        for (int i = 0; i < line.length(); ++i) {
            char ch = line.charAt(i);
            if (ch == 'a' || ch == 'b' || ch == 'c') num += '2';
            else if (ch == 'd' || ch == 'e' || ch == 'f') num += '3';
            else if (ch == 'g' || ch == 'h' || ch == 'i') num += '4';
            else if (ch == 'j' || ch == 'k' || ch == 'l') num += '5';
            else if (ch == 'm' || ch == 'n' || ch == 'o') num += '6';
            else if (ch == 'p' || ch == 'q' || ch == 'r' || ch == 's') num += '7';
            else if (ch == 't' || ch == 'u' || ch == 'v') num += '8';
            else if (ch == 'w' || ch == 'x' || ch == 'y' || ch == 'z') num += '9';
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while(t-- > 0) {
            String line = sc.nextLine().trim();
            String num = getNum(line);
            if (check(num)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
