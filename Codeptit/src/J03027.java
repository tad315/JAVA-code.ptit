import java.util.*;

public class J03027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() == c) st.pop();
            else st.push(c);
        }
        if (st.isEmpty()) System.out.println("Empty String");
        else {
            String res = "";
            for (char c : st) res += c;
            System.out.print(res);
        }
    }
}
