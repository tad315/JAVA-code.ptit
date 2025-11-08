package baiK;

public class GiangVien {
    String ma, ten;
    double tongGio = 0;

    GiangVien(String line) {
        String[] parts = line.trim().split(" ", 2);
        ma = parts[0];
        ten = parts[1];
    }
    boolean match(String code) {
        return ma.equals(code);
    }
    @Override
    public String toString() {
        return ten + " " + String.format("%.2f", tongGio);
    }
}
