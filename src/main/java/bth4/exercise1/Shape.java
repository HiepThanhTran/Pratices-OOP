package bth4.exercise1;

public abstract class Shape {

    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return String.format("\nHình: %s\nDiện tích: %.2f\nChu vi: %.2f\n", this.name, this.getArea(), this.getPerimeter());
    }
}
