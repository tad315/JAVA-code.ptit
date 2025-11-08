package baiJ;
import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args) throws Exception{
        Scanner sc1 = new Scanner(new File("DANHSACH.in"));
        Map<String, SinhVien> map = new HashMap<>();
        while(sc1.hasNextLine()) {
            String ma = sc1.nextLine().trim();
            String ten = sc1.nextLine().trim();
            String lop = sc1.nextLine().trim();
            String email = sc1.nextLine().trim();
            String sdt = sc1.nextLine().trim();
            if (!sdt.startsWith("0")) sdt = "0" + sdt;
            map.put(ma, new SinhVien(ma, ten, lop, email, sdt));
        }
        sc1.close();
        Scanner sc2 = new Scanner(new File("HUONGDAN.in"));
        int n = Integer.parseInt(sc2.nextLine().trim());
        ArrayList<DoAn> ds = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            String line = sc2.nextLine();
            String[] p = line.split("\\s+");
            int m = Integer.parseInt(p[p.length - 1]);
            String tenGV = String.join(" ", Arrays.copyOf(p, p.length - 1));
            for (int j = 0; j < m; ++j) {
                String msv = sc2.next();
                String tenDoAn = sc2.nextLine().trim();
                SinhVien sv = map.get(msv);
                ds.add(new DoAn(sv, tenGV, tenDoAn));
            }
        }
        sc2.close();
        Collections.sort(ds);
        for (DoAn x : ds) {
            System.out.println(x);
        }
    }
}
