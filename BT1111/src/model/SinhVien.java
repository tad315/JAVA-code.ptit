package model;

public class SinhVien {
    private String maSV, hoTen, lop;
    private double gpa;

    public SinhVien (String maSV, String hoTen, String lop, double gpa) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.gpa = gpa;
    }
    public String getMaSV() {
        return maSV;
    }
    public String getHoTen(){
        return hoTen;
    }
    public String getLop() {
        return lop;
    }
    public double getGpa() {
        return gpa;
    }
    public void setMaSV (String maSV) {
        this.maSV = maSV;
    }
    public void setHoTen (String hoTen) {
        this.hoTen = hoTen;
    }
    public void setLop(String lop) {
        this.lop = lop;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
