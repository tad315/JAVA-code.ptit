package J04003;
import java.math.BigInteger;

public class PS {
    private BigInteger tu;
    private BigInteger mau;

    public PS (BigInteger tu, BigInteger mau) {
        this.tu = tu;
        this.mau = mau;
        rutGon();
    }

    private void rutGon() {
        BigInteger gcd = tu.gcd(mau);
        tu =  tu.divide(gcd);
        mau = mau.divide(gcd);
    }

    public String toString() {
        return tu + "/" + mau;
    }
}
