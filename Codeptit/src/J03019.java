import java.util.*;

public class J03019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String line = sc.next();
        char maxChar = 0;
        StringBuilder s = new StringBuilder();
        for (int i = line.length() - 1; i >= 0; --i) {
            char c = line.charAt(i);
            if (c >= maxChar) {
                maxChar = c;
                s.append(c);
            }
        }
        System.out.println(s.reverse().toString());
    }
}
