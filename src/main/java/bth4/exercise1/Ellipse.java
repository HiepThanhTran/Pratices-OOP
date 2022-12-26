package bth4.exercise1;

public class Ellipse extends Shape {

    private double x;
    private double y;

    public Ellipse(String name, double x, double y) {
        super(name);
        this.x = x;
        this.y = y;
    }

    @Override
    public double getArea() {
        return Math.PI * x * y;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)) / 2);
    }
}
