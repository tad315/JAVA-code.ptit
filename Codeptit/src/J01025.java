import java.io.*;
import java.util.*;

public class J01025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1a = sc.nextInt(), y1a = sc.nextInt(), x1b = sc.nextInt(), y1b = sc.nextInt();
        int x2a = sc.nextInt(), y2a = sc.nextInt(), x2b = sc.nextInt(), y2b = sc.nextInt();
        int minX = Math.min(x1a, x2a);
        int maxX = Math.max(x1b, x2b);
        int minY = Math.min(y1a, y2a);
        int maxY = Math.max(y1b, y2b);

        int side = Math.max(maxX - minX, maxY - minY);
        System.out.print(side * side);
        sc.close();
    }
}
