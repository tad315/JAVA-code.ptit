package baiK;

public class Polygon {
    private Point[] points;
    public Polygon(Point[] points) {
        this.points = points;
    }
    public String getArea() {
        int n = points.length;
        long sum = 0;
        for (int i = 0; i < n; ++i) {
            int j = (i + 1) % n;
            sum += (long)points[i].x * points[j].y - (long)points[j].x * points[i].y;
        }
        double area = Math.abs(sum) / 2.0;
        return String.format("%.3f", area);
    }
}
