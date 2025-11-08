package J06009;
import java.text.*;
import java.util.*;

public class khachhang {
    private String ma, ten, gT, nS, dC;
    private static int cnt = 1;

    public khachhang(String ten, String gT, String nS, String dC) {
        this.ma = String.format("KH%03d", cnt++);
        this.ten = ten;
        this.gT = gT;
        this.nS = nS;
        this.dC = dC;
    }
    public String getMa() {
        return ma;
    }
    public String getTen() {
        return ten;
    }
    public String getDC() {
        return dC;
    }
    @Override
    public String toString() {
        return ten + " " + dC;
    }
}
