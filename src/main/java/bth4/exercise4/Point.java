package bth4.exercise4;

import java.text.DecimalFormat;

public class Point {

    private double x;
    private double y;

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
        DecimalFormat dcf = new DecimalFormat("###,###.##");
        return String.format("(%s, %s)", dcf.format(this.x), dcf.format(this.y));
    }
}
