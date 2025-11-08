package J04007;

import java.util.Scanner;

public class NV {
    private String MNV;
    private String ten;
    private String gt;
    private String ngaySinh;
    private String dc;
    private String mst;
    private String hd;

    public NV() {
        this.MNV = "00001";
    }

    public void nhap(Scanner sc) {
        this.ten = sc.nextLine().trim();
        this.gt = sc.nextLine().trim();
        this.ngaySinh = sc.nextLine().trim();
        this.dc = sc.nextLine().trim();
        this.mst = sc.nextLine().trim();
        this.hd = sc.nextLine().trim();
    }

    public String toString() {
        return MNV + " " + ten + " " + gt + " " + ngaySinh + " " + dc + " " + mst + " " + hd;
    }
}
