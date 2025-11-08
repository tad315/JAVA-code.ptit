import java.util.Scanner;

public class J01005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            double n = sc.nextDouble();
            double h = sc.nextDouble();
            for (int k = 1; k < n; ++k) {
                double x = Math.sqrt(k / n) * h;
                System.out.printf("%.6f", x);
                if (k < n - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}

