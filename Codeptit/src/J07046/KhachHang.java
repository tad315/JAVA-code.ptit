package J07046;
import java.util.*;
import java.text.*;

public class KhachHang implements Comparable <KhachHang> {
    private String ma, ten, phong;
    private Date in, out;
    private long soNgay;
    private static int cnt = 1;

    public KhachHang(String ten, String phong, String in, String out) throws ParseException {
        this.ma = String.format("KH%02d", cnt++);
        this.ten = ten.trim();
        this.phong = phong.trim();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.in = sdf.parse(in.trim());
        this.out = sdf.parse(out.trim());
        this.soNgay = (this.out.getTime() - this.in.getTime()) / (1000 * 60 * 60 * 24);
    }
    public int compareTo(KhachHang o) {
        return Long.compare(o.soNgay, this.soNgay);
    }
    public String toString(){
        return ma + " " + ten + " " + phong + " " + soNgay;
    }
}
