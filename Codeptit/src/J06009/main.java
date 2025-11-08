package J06009;
import java.io.*;
import java.util.*;
public class main {
    public static void main(String[] args) throws Exception {
        Scanner sc1 = new Scanner(new File("KH.in"));
        Scanner sc2 = new Scanner(new File("MH.in"));
        Scanner sc3 = new Scanner(new File("HD.in"));

        int n = Integer.parseInt(sc1.nextLine());
        ArrayList<khachhang> dsKH = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            String ten = sc1.nextLine().trim();
            String gt = sc1.nextLine().trim();
            String nS = sc1.nextLine().trim();
            String dC = sc1.nextLine().trim();
            dsKH.add(new khachhang(ten, gt, nS, dC));
        }
        int m = Integer.parseInt(sc2.nextLine());
        ArrayList<mathang> dsMH = new ArrayList<>();
        for (int i = 0; i < m; ++i) {
            String ten = sc2.nextLine().trim();
            String dv = sc2.nextLine().trim();
            int mua = Integer.parseInt(sc2.nextLine().trim());
            int ban = Integer.parseInt(sc2.nextLine().trim());
            dsMH.add(new mathang(ten, dv, mua, ban));
        }
        int k = Integer.parseInt(sc3.nextLine());
        ArrayList<hoadon> dsHD =  new ArrayList<>();
        for (int i = 0; i < k; ++i) {
            String maKH = sc3.next();
            String maMH = sc3.next();
            int sl = sc3.nextInt();
            khachhang kh = null;
            mathang mh = null;

            for(khachhang x : dsKH) {
                if (x.getMa().equals(maKH)) kh = x;
            }
            for (mathang y : dsMH) {
                if (y.getMa().equals(maMH)) mh = y;
            }
            dsHD.add(new hoadon(kh, mh, sl));
        }
        for (hoadon hd : dsHD) {
            System.out.println(hd);
        }
    }
}
