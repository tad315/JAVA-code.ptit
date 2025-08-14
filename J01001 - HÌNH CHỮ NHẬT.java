import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a <= 0 || b <= 0) {
            System.out.print("0");
        }
        else{
            int P = 2 * (a + b);
            int S = a * b;
            System.out.println(P + " " + S);
        }
        sc.close();
    }
}
