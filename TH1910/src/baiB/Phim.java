package baiB;
import java.text.*;
import java.util.*;

public class Phim implements Comparable<Phim>{
    private String id, name;
    private Theloai tl;
    private Date d;
    private int soTap;

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public Phim(String id, Theloai tl, String d, String name, int soTap)  throws ParseException {
        this.id = id;
        this.tl = tl;
        this.d = sdf.parse(d);
        this.name = name;
        this.soTap = soTap;
    }

    public int compareTo(Phim o) {
        if(!this.d.equals(o.d)) return this.d.compareTo(o.d);
        if(!this.name.equals(o.name)) return this.name.compareTo(o.name);
        return Integer.compare(o.soTap, this.soTap);
    }
    public String toString() {
        return id + " " + tl.getName() + " " + sdf.format(d) + " " + name + " " + soTap;
    }
}
