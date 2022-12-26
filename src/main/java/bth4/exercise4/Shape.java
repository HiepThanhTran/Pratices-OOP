package bth4.exercise4;

import java.text.DecimalFormat;

public abstract class Shape implements IMovable {

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
        DecimalFormat dcf = new DecimalFormat("###,###.##");
        return String.format("\n- Diện tích: %s\n- Chu vi: %s\n", dcf.format(getArea()), dcf.format(getPerimeter()));
    }
}
