import java.io.Serializable;

public class Worker implements Serializable {
    private String id;
    private String name;
    private String in;
    private String out;
    private int workMinutes;

    public Worker(String id, String name, String in, String out) {
        this.id = id;
        this.name = name;
        this.in = in;
        this.out = out;
        this.workMinutes = calcMinutes();
    }

    private int parseTime(String t) {
        String[] parts = t.split(":");
        int hh = Integer.parseInt(parts[0]);
        int mm = Integer.parseInt(parts[1]);
        return hh * 60 + mm;
    }

    private int calcMinutes() {
        return parseTime(out) - parseTime(in) - 60; // trừ 1h nghỉ trưa
    }

    public int getWorkMinutes() {
        return workMinutes;
    }

    public String getId() {
        return id;
    }

    private String getStatus() {
        return workMinutes >= 480 ? "DU" : "THIEU";
    }

    private String formatTime() {
        int h = workMinutes / 60;
        int m = workMinutes % 60;
        return h + " gio " + m + " phut";
    }

    @Override
    public String toString() {
        return id + " " + name + " " + formatTime() + " " + getStatus();
    }
}
