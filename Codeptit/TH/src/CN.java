public class CN implements Comparable<CN>{
    private String id;
    private String name;
    private String timeIn;
    private String timeOut;
    private int timeWork;

    public CN (String id, String name, String timeIn, String timeOut) {
        this.id = id;
        this.name = name;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
        this.timeWork = calc(timeIn, timeOut) - 60;
    }

    private int calc(String timeIn, String timeOut) {
        String[] In = timeIn.split(":");
        String[] Out = timeOut.split(":");
        int hIn = Integer.parseInt(In[0]);
        int mIn = Integer.parseInt(In[1]);
        int hOut = Integer.parseInt(Out[0]);
        int mOut = Integer.parseInt(Out[1]);

        return (hOut * 60 + mOut) - (hIn * 60 + mIn);
    }

    public String getID() {
        return id;
    }

    public int getTimeWork() {
        return timeWork;
    }

    private String getStatus() {
        if (timeWork >= 8 * 60) return "DU";
        return "THIEU";
    }

    public int compareTo(CN other) {
        if (this.timeWork != other.timeWork) {
            return Integer.compare(other.timeWork, this.timeWork);
        }
        return this.id.compareTo(other.id);
    }

    public String toString() {
        int h = timeWork / 60;
        int m = timeWork % 60;

        return id + " " + name + " " + h + " gio " + m + " phut " + getStatus();
    }
}
