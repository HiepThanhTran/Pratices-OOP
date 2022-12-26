package bth4.exercise4;

public class Rectangle extends Shape implements IMovable {

    private Point topLeft;
    private double length;
    private double width;

    public Rectangle(String name, Point topLeft, double length, double width) {
        super(name);
        this.topLeft = topLeft;
        this.length = length;
        this.width = width;
    }

    public Rectangle(String name, double x, double y, double length, double width) {
        super(name);
        this.topLeft = new Point(x, y);
        this.length = length;
        this.width = width;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public void setTopLeft(double x, double y) {
        this.topLeft = new Point(x, y);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    @Override
    public void moveUp() {
        this.topLeft.setY(this.topLeft.getY() + 1);
    }

    @Override
    public void moveDown() {
        this.topLeft.setY(this.topLeft.getY() - 1);
    }

    @Override
    public void moveLeft() {
        this.topLeft.setX(this.topLeft.getX() - 1);
    }

    @Override
    public void moveRight() {
        this.topLeft.setX(this.topLeft.getX() + 1);
    }
}
