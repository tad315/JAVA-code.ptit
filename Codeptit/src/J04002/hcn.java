package J04002;

public class hcn {
    private double width;
    private double height;
    private String color;

    public hcn() {
        this.width = 1;
        this.height = 1;
        this.color = "White";
    }

    public hcn(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double findArea() {
        return this.width * this.height;
    }

    public double findPerimeter() {
        return 2 * (this.width + this.height);
    }
}
