package J04001;

public class point {
    private double x;
    private double y;

    public point() {
        this.x = 0;
        this.y = 0;
    }

    public point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public point (point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }

    public double distance(point secondPoint) {
        double dx = this.x - secondPoint.x;
        double dy = this.y - secondPoint.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static double distance(point p1, point p2) {
        double dx = p1.x - p2.x;
        double dy = p1.y - p2.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
