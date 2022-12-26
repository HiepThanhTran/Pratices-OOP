package bth4.exercise4;

public class Circle extends Shape implements IMovable {

    private Point center;
    private double radius;

    public Circle(String name, Point center, double radius) {
        super(name);
        this.center = center;
        this.radius = radius;
    }

    public Circle(String name, double x, double y, double radius) {
        super(name);
        this.center = new Point(x, y);
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setCenter(double x, double y) {
        this.center = new Point(x, y);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public void moveUp() {
        this.center.setY(this.center.getY() + 1);
    }

    @Override
    public void moveDown() {
        this.center.setY(this.center.getY() - 1);
    }

    @Override
    public void moveLeft() {
        this.center.setX(this.center.getX() - 1);
    }

    @Override
    public void moveRight() {
        this.center.setX(this.center.getX() + 1);
    }
}
