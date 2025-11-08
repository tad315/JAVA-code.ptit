import java.io.*;
import java.util.*;

public class J07002 {
    public static void main (String[] args) throws Exception {
        Scanner sc = new Scanner (new File("DATA.in"));
        long sum = 0;
        while (sc.hasNext()) {
            String token = sc.next();
            try {
                int val = Integer.parseInt(token);
                sum += val;
            } catch (NumberFormatException e) {

            }
        }
        System.out.println(sum);
    }
}
