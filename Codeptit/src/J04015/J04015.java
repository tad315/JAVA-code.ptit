package J04015;
import java.util.Scanner;

public class J04015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ma = sc.nextLine().trim();
        String ten = sc.nextLine().trim();
        long luongCoBan = Long.parseLong(sc.nextLine().trim());

        GV t = new GV(ma, ten, luongCoBan);
        System.out.println(t);
    }
}
