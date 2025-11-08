package baiH;
import java.util.*;
import java.io.*;

public class main {
    public static void main (String[] args) throws Exception {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc1.nextLine().trim());
        Map<String, SinhVien> map = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            String ma   = sc1.nextLine().trim();
            String ten  = sc1.nextLine().trim();
            String lop  = sc1.nextLine().trim();
            String email= sc1.nextLine().trim();
            String sdt  = sc1.nextLine().trim();
            String gt   = sc1.nextLine().trim();
            map.put(ma, new SinhVien(ma, ten, lop, email, sdt, gt));
        }
        sc1.close();

        Scanner sc2 = new Scanner(new File("DANGKY.in"));
        while (sc2.hasNextLine()) {
            String line = sc2.nextLine().trim();
            if (line.isEmpty()) continue;
            String[] p = line.split("\\s+");
            if (p.length == 2) {
                String ma = p[0];
                String sz = p[1];
                SinhVien sv = map.get(ma);
                if (sv != null) sv.setSz(sz);
            }
        }
        sc2.close();

        Scanner sc3 = new Scanner(new File("TRUYVAN.in"));
        int q = Integer.parseInt(sc3.nextLine().trim());
        for (int i = 0; i < q; ++i) {
            String line = sc3.nextLine().trim();
            String[] parts = line.split("\\s+");
            String gt = parts[0];
            String sz = parts[1].toUpperCase();

            System.out.println("DANH SACH SINH VIEN " + gt.toUpperCase() + " DANG KY SIZE " + sz);

            ArrayList<SinhVien> ds = new ArrayList<>();
            for (SinhVien x : map.values()) {
                if (x.sz != null && x.gT.equalsIgnoreCase(gt) && sz.equalsIgnoreCase(x.sz)) {
                    ds.add(x);
                }
            }
            ds.sort(Comparator.comparing(sv -> sv.ma));
            for (SinhVien x : ds) System.out.println(x);
        }
        sc3.close();
    }
}
