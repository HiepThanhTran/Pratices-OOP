package bth2.exercise1;

public class Point {

    private double x;
    private double y;
    private String t;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
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
        return "(" + x + ", " + y + ")";
    }

    public double distance(Point b) {
        return Math.sqrt(Math.pow(x - b.x, 2) + Math.pow(y - b.y, 2));
    }
}
