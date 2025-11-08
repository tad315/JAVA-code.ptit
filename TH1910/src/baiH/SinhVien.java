package baiH;

public class SinhVien {
    String ma, ten, lop, email, sdt, gT, sz;

    public SinhVien(String ma, String ten, String lop, String email, String sdt, String gT){
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.sdt = sdt;
        this.gT = gT;
    }

    public void setSz(String sz) {
        // chuẩn hoá size (S, M, L, XL, XXL)
        this.sz = sz == null ? null : sz.trim().toUpperCase();
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + email + " " + sdt;
    }
}
