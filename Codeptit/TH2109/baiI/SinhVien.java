public class SinhVien implements Comparable<SinhVien> {
    private String name;
    private long T;
    private long sub;

    public SinhVien (String name, long T, long sub) {
        this.name = name;
        this.T = T;
        this.sub = sub;
    }

    private String chuanHoa (String s) {
        s = s.trim().toLowerCase();
        String s1 = "";
        String[] ps = s.split("\\s+");
        for (String p : ps) {
            s1 = Character.toUpperCase(p.charAt(0)) + p.substring(1) + " ";
        }
        return s.trim();
    }

    public int compareTo(SinhVien o) {
        if (this.T != o.T) {
            return Long.compare(o.T, this.T);
        }
        if (this.sub != o.sub) {
            return Long.compare(this.sub, o.T);
        }
        return this.name.compareTo(o.name);
    }

    public String toString() {
        return name + " " + T + " " + sub;
    }
    
}
