package baiG;
import java.io.*;
import java.util.*;
import java.text.*;

public class main {
    public static void main (String[] args) throws Exception {
        Scanner sc = new Scanner(new File ("MUAHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        Map<String, SanPham> map = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int gia = Integer.parseInt(sc.nextLine());
            int bh = Integer.parseInt(sc.nextLine());
            map.put(ma, new SanPham(ma, ten, gia, bh));
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> ds = new ArrayList<>();
        for (int i = 0; i < m; ++i) {
            String ten = sc.nextLine();
            String dc = sc.nextLine();
            String maSP = sc.nextLine();
            int sl = Integer.parseInt(sc.nextLine());
            String ngay = sc.nextLine();
            ds.add(new KhachHang(ten, dc, map.get(maSP), sl, ngay));
        }
        Collections.sort(ds);
        for (KhachHang x : ds) System.out.println(x);
    }
}
