package J07046;
import java.io.*;
import java.util.*;

public class main {
    public static void main (String[] args) throws Exception {
        Scanner sc = new Scanner(new File("KHACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> ds = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            String ten = sc.nextLine().trim();
            String phong = sc.nextLine().trim();
            String in = sc.nextLine().trim();
            String out = sc.nextLine().trim();
            ds.add(new KhachHang(ten, phong, in, out));
        }
        Collections.sort(ds);
        for (KhachHang x : ds) {
            System.out.println(x);
        }
    }
}
