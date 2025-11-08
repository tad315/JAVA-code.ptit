import java.util.Scanner;
import java.util.Stack;

public class baiB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            Stack<Integer> stack = new Stack<>();
            int cnt = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    stack.push(++cnt);
                    System.out.print(cnt + " ");
                }
                else if (s.charAt(i) == ')') {
                    System.out.print(stack.pop() + " ");
                }
            }
            System.out.println();
        }
    }
}