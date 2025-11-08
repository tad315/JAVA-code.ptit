package J06009;

public class hoadon {
    private String ma;
    private khachhang kh;
    private mathang mh;
    private int sL;
    private static int cnt = 1;

    public hoadon(khachhang kh, mathang mh, int sL) {
        this.ma = String.format("HD%03d", cnt++);
        this.kh = kh;
        this.mh = mh;
        this.sL = sL;
    }
    public int getTien(){
        return sL * mh.getBan();
    }
    @Override
    public String toString() {
        return ma + " " + kh.getTen() + " " + kh.getDC() + " " + mh.getTenMH() + " " + mh.getDV() + " " + mh.getMua() + " " + mh.getBan() + " " + sL + " " + getTien();
    }
}
