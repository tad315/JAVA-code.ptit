import java.io.*;
import java.lang.runtime.ExactConversionsSupport;
import java.util.*;

public class baiI {
    public static void main (String[] args) throws Exception {
        Scanner sc = new Scanner (new File("LUYENTAP.in"));
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<SinhVien> list = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            String name = sc.nextLine();
            long T = sc.nextLong();
            long sub = sc.nextLong();
            sc.nextLine();
            list.add(new SinhVien(name, T, sub));
        }
        Collection.sort(list);
        for (SinhVien sv : list) {
            System.out.println(sv);
        }
    }
}
