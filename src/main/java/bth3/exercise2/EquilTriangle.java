package bth3.exercise2;

public class EquilTriangle extends Triangle { // Equilateral triangle: tam giác đều

    public EquilTriangle(double abc) {
        super(abc, abc, abc);
    }

    @Override
    public String toString() {
        return String.format("\nHình tam giác đều\nDiện tích: %.2f\nChu vi: %.2f\n", getArea(), getPerimeter());
    }
}
