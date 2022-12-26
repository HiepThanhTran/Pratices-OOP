package bth3.exercise2;

public class Squares extends Rectangle {

    public Squares(double edge) {
        super(edge, edge);
    }

    @Override
    public String toString() {
        return String.format("\nHình vuông\nDiện tích: %.2f\nChu vi: %.2f\n", getArea(), getPerimeter());
    }
}
