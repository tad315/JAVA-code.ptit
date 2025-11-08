package baiJ;

public class MonHoc {
    private String ma, ten, hinhThuc;

    public MonHoc(String ma, String ten, String hinhThuc) {
        this.ma = ma;
        this.ten = ten;
        this.hinhThuc = hinhThuc;
    }
    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getHinhThuc() {
        return hinhThuc;
    }

    public String toString() {
        return ma + " "  + ten + " " + hinhThuc;
    }
}
