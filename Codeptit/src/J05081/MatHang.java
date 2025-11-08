package J05081;

public class MatHang implements Comparable<MatHang> {
    private String ma, ten, donVi;
    private int giaMua, giaBan;

    private static int dem = 1;

    public MatHang(String ten, String donVi, int giaMua, int giaBan) {
        this.ma = String.format("MH%03d", dem++);
        this.ten = ten;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public int getLoiNhuan() {
        return giaBan - giaMua;
    }

    public int compareTo(MatHang other) {
        if (this.getLoiNhuan() != other.getLoiNhuan()) {
            return other.getLoiNhuan() - this.getLoiNhuan();
        }
        return this.ma.compareTo(other.ma);
    }

    public String toString() {
        return ma + " " + ten + " " + donVi + " " + giaMua + " " + giaBan + " " + getLoiNhuan();
    }
}
