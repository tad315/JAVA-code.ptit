import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class J03005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        while(n -- > 0) {
            String line = sc.nextLine().trim();
            String[] ps = line.split("\\s+");
            for (int i = 0; i < ps.length; i++) {
                ps[i] = ps[i].substring(0, 1).toUpperCase() + ps[i].substring(1).toLowerCase();
            }
            String s = ps[0].toUpperCase();
            String res = String.join(" ", Arrays.copyOfRange(ps, 1, ps.length));
            System.out.println(res + ", " + s);
        }
    }
}
