package J04001;
import java.util.*;

public class J04001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0) {
            double x1 =  sc.nextDouble();
            double y1 =  sc.nextDouble();
            double x2 =  sc.nextDouble();
            double y2 =  sc.nextDouble();

            point p1 =  new point(x1,y1);
            point p2 = new point(x2,y2);

            double d = point.distance(p1,p2);
            System.out.printf("%.4f\n", d);
        }
    }
}
