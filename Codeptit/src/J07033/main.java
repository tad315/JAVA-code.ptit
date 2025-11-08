package J07033;
import java.util.*;
import java.io.*;

public class main {
    public static void main (String[] args) throws Exception {
        Scanner sc = new Scanner (new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> ds = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            String ma = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            String lop = sc.nextLine().trim();
            String email = sc.nextLine().trim();
            ds.add(new SinhVien(ma, ten, lop, email));
        }
        Collections.sort(ds);
        for (SinhVien sv : ds) {
            System.out.println(sv);
        }
    }
}
