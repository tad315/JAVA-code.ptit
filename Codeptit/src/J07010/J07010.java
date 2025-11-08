package J07010;
import java.io.*;
import java.util.*;

public class J07010 {
    public static void main (String[] args) throws Exception {
        Scanner sc = new Scanner(new File("SV.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SV> list = new ArrayList<>();
        for (int i = 1; i <= n; ++i) {
            String name = sc.nextLine().trim();
            String Class = sc.nextLine().trim();
            String birth = sc.nextLine().trim();
            double gpa = Double.parseDouble(sc.nextLine().trim());
            list.add(new SV(i, name, Class, birth, gpa));
        }
        for (SV sv : list) {
            System.out.println(sv);
        }
    }
}
