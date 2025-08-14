import java.util.Scanner;

public class J01003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        if (a == 0) {
            if (b == 0) {
                System.out.print("VSN");
            }
            else {
                System.out.print("VN");
            }
        }
        else {
            float x = -1 * b / a;
            System.out.printf("%.2f", x);
        }
        sc.close();
    }
}
