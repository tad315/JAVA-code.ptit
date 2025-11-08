package J07037;
import java.io.*;

public class DoanhNghiep implements Comparable<DoanhNghiep> {
    private String ma, ten;
    private int sl;
    public DoanhNghiep(String ma, String ten, int sl) {
        this.ma = ma;
        this.ten = ten;
        this.sl = sl;
    }
    public String getMa() {
        return ma;
    }
    public int compareTo(DoanhNghiep o) {
        return this.ma.compareTo(o.ma);
    }
    public String toString() {
        return ma + " " + ten + " " + sl;
    }
}
