package baiI;

public class CN implements Comparable<CN>{
    private String ma, ten, in, out;
    private int gioLam;
    private String tt;
    public CN(String ma, String ten, String in, String out) {
        this.ma = ma;
        this.ten = ten;
        this.in = in;
        this.out = out;
        this.gioLam = tinhGio();
        this.tt = (gioLam >= 8 * 60 ? "DU" : "THIEU");
    }
    private int tinhGio() {
        String[] tIn = in.split(":");
        String[] tOut = out.split(":");
        int h1 = Integer.parseInt(tIn[0]);
        int m1 = Integer.parseInt(tIn[1]);
        int h2 = Integer.parseInt(tOut[0]);
        int m2 = Integer.parseInt(tOut[1]);

        return ((h2 * 60 + m2) - (h1 * 60 + m1)) - 60;
    }
    public int getGioLam() {
        return gioLam;
    }
    public String getMa() {
        return ma;
    }
    public int compareTo(CN o) {
        if(this.gioLam != o.gioLam) return o.gioLam - this.gioLam;
        return this.ma.compareTo(o.ma);
    }
    public String toString() {
        int h = gioLam / 60;
        int m = gioLam % 60;
        return ma + " " + ten + " " + h + " gio " + m + " phut " + tt;
    }
}
