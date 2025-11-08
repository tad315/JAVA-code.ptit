import java.util.Scanner;

public class J03032 {
    public static String rev(String s) {
        String res = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            res += s.charAt(i);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while(t-- > 0) {
            String line = sc.nextLine().trim();
            String[] s = line.split("\\s+");
            String[] res = new String[s.length];
            for (int i = 0; i < s.length; i++) {
                res[i] = rev(s[i]);
            }
            for (int i = 0; i < res.length; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println();
        }
    }
}
