package baiI;

public class SinhVien {
    private String name;
    private int T;
    private int sub;

    public SinhVien (String name, int T, int sub) {
        this.name = name;
        this.T = T;
        this.sub = sub;
    }
    public String getName() {
        return name;
    }
    public int getT() {
        return T;
    }
    public int getSub() {
        return sub;
    }

    public String toString() {
        return name + " " + T + " " + sub;
    }
}
