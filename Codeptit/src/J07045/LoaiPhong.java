package J07045;
import java.util.*;

public class LoaiPhong implements Comparable<LoaiPhong> {
    private String kh, ten;
    private int gia;
    private double dv;
    public LoaiPhong(String line) {
        String[] parts = line.trim().split("\\s+");
        this.kh = parts[0];
        this.ten = parts[1];
        this.gia = Integer.parseInt(parts[2]);
        this.dv = Double.parseDouble(parts[3]);
    }
    public int compareTo(LoaiPhong o) {
        return this.ten.compareTo(o.ten);
    }
    public String toString() {
        return kh + " " + ten + " " + gia + " " + String.format("%.2f", dv);
    }
}
