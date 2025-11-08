package baiJ;

public class DoAn implements Comparable<DoAn> {
    SinhVien sv;
    String tenGV, tenDoAn;
    public DoAn(SinhVien sv, String tenGV, String tenDoAn) {
        this.sv = sv;
        this.tenGV = tenGV;
        this.tenDoAn = tenDoAn;
    }
    public int compareTo(DoAn o) {
        return this.sv.ma.compareTo(o.sv.ma);
    }
    public String toString() {
        return sv.ma + " " + sv.ten + " " + tenGV + " " + tenDoAn + " " + sv.sdt;
    }
}
