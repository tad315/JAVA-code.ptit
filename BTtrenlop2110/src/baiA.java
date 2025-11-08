import java.util.*;

public class baiA {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        while (n-- > 0) {
            String s = sc.nextLine().trim();
            String[] words = s.split("\\s+");
            Stack<String> st = new Stack<>();
            for (String w : words) {
                st.push(w);
            }
            String res = "";
            while(!st.empty()) {
                res += st.pop();
                if (!st.isEmpty()) res += " ";
            }
            System.out.println(res);
        }
    }
}
