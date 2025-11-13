import java.util.*;

public class J02037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String line = sc.nextLine().trim();
            String[] p = line.split("\\s+");
            int cntC = 0, cntL = 0;
            for (String s : p) {
                int x = Integer.parseInt(s);
                if (x % 2 == 0) ++cntC;
                else ++cntL;
            }
            int n = p.length;
            if (n % 2 == 0 && cntC > cntL) {
                System.out.println("YES");
            }
            else if (n % 2 != 0 && cntL > cntC) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
