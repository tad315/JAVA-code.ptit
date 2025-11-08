package J04008;
import java.util.Scanner;

public class J04008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while (t-- > 0) {
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double x3 = sc.nextDouble();
            double y3 = sc.nextDouble();

            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            Point p3 = new Point(x3, y3);

            double a = Point.distance(p1, p2);
            double b = Point.distance(p2, p3);
            double c = Point.distance(p1, p3);

            if (a + b <= c || a + c <= b || b + c <= a) {
                System.out.println("INVALID");
            }
            else {
                double cv = a + b + c;
                System.out.printf("%.3f\n", cv);
            }
        }
    }
}


