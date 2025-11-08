import java.io.*;
import java.util.*;

public class J07022 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> ds = new ArrayList<>();
        while (sc.hasNext()) {
            String token = sc.next();
            try {
                Integer.parseInt(token);
            } catch (NumberFormatException e) {
                ds.add(token);
            }
        }
        Collections.sort(ds);
        for (int i = 0; i < ds.size(); i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(ds.get(i));
        }
    }
}