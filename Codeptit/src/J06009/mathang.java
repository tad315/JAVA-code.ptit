package J06009;

public class mathang {
    private String ma, tenMH, dV;
    private int mua, ban;
    private static int cnt = 1;

    public mathang(String tenMH, String dV, int mua, int ban) {
        this.ma = String.format("MH%03d", cnt++);
        this.tenMH = tenMH;
        this.dV = dV;
        this.mua = mua;
        this.ban = ban;
    }
    public String getMa() {
        return ma;
    }
    public String getTenMH() {
        return tenMH;
    }
    public String getDV() {
        return dV;
    }
    public int getMua() {
        return mua;
    }
    public int getBan() {
        return ban;
    }
    @Override
    public String toString() {
        return tenMH + " " + dV + " " + mua + " " + ban;
    }
}
