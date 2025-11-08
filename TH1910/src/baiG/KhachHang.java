package baiG;
import java.text.*;
import java.util.*;

public class KhachHang implements Comparable<KhachHang> {
    static int cnt = 1;
    String maKH, ten, dc;
    SanPham sp;
    int sl;
    Date mua, han;
    public KhachHang(String ten, String dc, SanPham sp, int sl, String mua) throws Exception {
        this.maKH = String.format("KH%02d", cnt++);
        this.ten = ten;
        this.dc = dc;
        this.sp = sp;
        this.sl = sl;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.mua = sdf.parse(mua);
        Calendar cal = Calendar.getInstance();
        cal.setTime(this.mua);
        cal.add(Calendar.MONTH, sp.bh);
        this.han = cal.getTime();
    }
    public int compareTo(KhachHang o) {
        if (!this.han.equals(o.han)) return this.han.compareTo(o.han);
        return this.maKH.compareTo(o.maKH);
    }
    public String toString(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        long tien = (long) sl * sp.gia;
        return maKH + " " + ten + " " + dc + " " + sp.ma + " " + tien + " " + sdf.format(han);
    }

}
