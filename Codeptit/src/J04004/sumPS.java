package J04004;

public class sumPS {
    private long tu;
    private long mau;

    public sumPS(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
        rutGon();
    }

    private void rutGon() {
        long g = gcd(tu, mau);
        mau /= g;
        tu /= g;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public sumPS add(sumPS a) {
        long tu = this.tu * a.mau + this.mau * a.tu;
        long mau = this.mau * a.mau;
        return new sumPS(tu, mau);
    }

    public String toString() {
        return tu + "/" + mau;
    }
}
