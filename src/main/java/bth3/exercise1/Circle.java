package bth3.exercise1;

public class Circle extends Ellipse {

    public Circle(double radius) {
        super(radius, radius);
    }

    @Override
    public String toString() {
        return String.format("\nHình Circle\nDiện tích: %f\nChu vi: %f\n", getArea(), getPerimeter());
    }
}
