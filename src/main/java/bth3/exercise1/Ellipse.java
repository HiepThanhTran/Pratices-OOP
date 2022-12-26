package bth3.exercise1;

public class Ellipse {

    private double x;
    private double y;

    public Ellipse(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getArea() {
        return Math.PI * x * y;
    }

    public double getPerimeter() {
        return 2 * Math.PI * Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)) / 2);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("\nHình Ellipse\nDiện tích: %f\nChu vi: %f\n", getArea(), getPerimeter());
    }
}
