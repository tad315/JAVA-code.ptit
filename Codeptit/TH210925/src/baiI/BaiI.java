package baiI;
import java.io.*;
import java.util.*;

public class BaiI {
    public static void main (String[] args) throws Exception {
        Scanner sc = new Scanner (new File("LUYENTAP.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> list = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            String name = sc.nextLine().trim();
            String[] part = sc.nextLine().split(" ");
            int T = Integer.parseInt(part[0]);
            int sub = Integer.parseInt(part[1]);

            list.add(new SinhVien(name, T, sub));
        }
        Collections.sort(list, new Comparator<SinhVien>() {
            public int compare (SinhVien s1, SinhVien s2) {
                if (s1.getT() != s2.getT()) {
                    return Long.compare(s2.getT(), s1.getT());
                }
                if (s1.getSub() != s2.getSub()) {
                    return Long.compare(s1.getSub(), s2.getSub());
                }
                return s1.getName().compareTo(s2.getName());
            }
        });
        for (SinhVien sv : list) {
            System.out.println(sv);
        }
    }
}
