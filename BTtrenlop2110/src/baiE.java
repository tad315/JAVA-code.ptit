import java.util.*;
import java.io.*;

public class baiE {

    static long calc(long a, long b, String op) {
        if (op.equals("+")) {
            return a + b;
        } else if (op.equals("-")) {
            return a - b;
        }
        else if (op.equals("*")) {
            return a * b;
        }
        return  a / b;
    }

    static boolean check(String token) {
        return token.equals("+") || token.equals("-") ||
                token.equals("*") || token.equals("/");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        while (T-- > 0) {
            int N = sc.nextInt();
            sc.nextLine();
            String[] tokens = sc.nextLine().split(" ");
            Stack<Long> stack = new Stack<>();

            for (int i = tokens.length - 1; i >= 0; i--) {
                if (check(tokens[i])) {
                    long a = stack.pop();
                    long b = stack.pop();
                    long res = calc(a, b, tokens[i]);
                    stack.push(res);
                } else {
                    stack.push(Long.parseLong(tokens[i]));
                }
            }
            System.out.println(stack.pop());
        }

    }
}