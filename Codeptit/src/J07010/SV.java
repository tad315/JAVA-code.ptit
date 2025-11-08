package J07010;

public class SV {
    private String id, name, Class, birth;
    private double gpa;

    public SV(int id, String name, String Class, String birth, double gpa) {
        this.id = "B20DCCN" + String.format("%03d", id);
        this.name = name;
        this.Class = Class;
        this.birth = chuanHoa(birth);
        this.gpa = gpa;
    }

    private String chuanHoa(String s) {
        String[] parts = s.split("/");
        String d = parts[0], m =  parts[1], y = parts[2];
        if (d.length() == 1) d = "0" + d;
        if (m.length() == 1) m = "0" + m;
        return d + "/" + m + "/" + y;
    }

    public String toString() {
        return id + " " + name + " " + Class + " " + birth + " " + String.format("%.2f", gpa);
    }
}
