package J04005;
import java.util.Scanner;

public class J04005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String birthday = sc.nextLine();
        float d1 = Float.parseFloat(sc.nextLine());
        float d2 = Float.parseFloat(sc.nextLine());
        float d3 = Float.parseFloat(sc.nextLine());

        ThiSinh ts = new ThiSinh(name, birthday, d1, d2, d3);
        System.out.println(ts);
    }
}
