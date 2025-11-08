import java.util.*;

public class J03004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while (t-- > 0) {
            String line = sc.nextLine().trim();
            String[] ps = line.split("\\s+");
            for (int i = 0; i < ps.length; ++i) {
                ps[i] = ps[i].substring(0, 1).toUpperCase() + ps[i].substring(1).toLowerCase();
            }
            System.out.println(String.join(" ", ps));
        }
    }
}
