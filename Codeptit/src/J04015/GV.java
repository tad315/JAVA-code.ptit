package J04015;

public class GV {
    private String MGV, ten;
    private long luongCB;

    public GV(String MGV, String ten, long luongCB) {
        this.MGV = MGV;
        this.ten = ten;
        this.luongCB = luongCB;
    }

    public int getBacLuong() {
        return Integer.parseInt(MGV.substring(2));
    }

    public long getPhuCap() {
        String chucVu = MGV.substring(0, 2);
        switch (chucVu) {
            case "HT": return 2000000;
            case "HP": return 900000;
            default: return 500000;
        }
    }

    public long getThuNhap() {
        return luongCB * getBacLuong() + getPhuCap();
    }

    public String toString() {
        return MGV + " " + ten + " " + getBacLuong() + " " + getPhuCap() + " " + getThuNhap();
    }
}
