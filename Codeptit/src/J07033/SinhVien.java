package J07033;
import java.util.*;

public class SinhVien implements Comparable<SinhVien> {
    private String ma, ten, lop, email;
    public SinhVien(String ma, String ten, String lop, String email) {
        this.ma = ma;
        this.ten = ChuanHoa(ten);
        this.lop = lop;
        this.email = email;
    }
    private String ChuanHoa(String s) {
        s = s.trim().toLowerCase();
        String[] words = s.split("\\s+");
        String res = "";
        for (String w: words) {
            res += Character.toUpperCase(w.charAt(0)) + w.substring(1) + " ";
        }
        return res;
    }
    public int compareTo(SinhVien o) {
        return this.ma.compareTo(o.ma);
    }
    public String toString() {
        return ma + " " + ten + " " + lop + " " + email;
    }
}
