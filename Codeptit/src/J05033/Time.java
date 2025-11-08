package J05033;

public class Time implements Comparable<Time> {
    private int h, m, s;

    public Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public int compareTo(Time other) {
        if (this.h != other.h) return this.h - other.h;
        if (this.m != other.m) return this.m - other.m;
        return this.s - other.s;
    }

    public String toString() {
        return h + " " + m + " " + s;
    }
}
