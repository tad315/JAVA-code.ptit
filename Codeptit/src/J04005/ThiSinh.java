package J04005;

public class ThiSinh {
    private String name;
    private String birthday;
    private float d1, d2, d3;

    public ThiSinh(String name, String birthday, float d1, float d2, float d3) {
        this.name = name;
        this.birthday = birthday;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public float sum() {
        return d1 + d2 + d3;
    }

    public String toString() {
        return name + " " + birthday + " " + String.format("%.1f", sum());
    }
}
