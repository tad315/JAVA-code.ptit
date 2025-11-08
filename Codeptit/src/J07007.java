import java.io.*;
import java.util.*;

public class J07007 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File ("VANBAN.in"));
        TreeSet<String> set = new TreeSet<>();
        while (sc.hasNextLine()) {
            String s = sc.next().toLowerCase();
            set.add(s);
        }
        for (String s : set) {
            System.out.println(s);
        }
    }
}
