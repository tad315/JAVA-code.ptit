package J04002;
import java.util.*;

public class J04002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        String color = sc.next();

        if (width <= 0 || height <= 0) System.out.println("INVALID");
        else {
            String normColor = color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
            hcn rect = new hcn(width, height, normColor);
            System.out.printf("%.0f %.0f %s\n", rect.findPerimeter(), rect.findArea(), rect.getColor());
        }
    }
}
