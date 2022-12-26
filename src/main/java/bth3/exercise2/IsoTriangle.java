package bth3.exercise2;

public class IsoTriangle extends Triangle { // Isosceles triangle: tam giác cân

    public IsoTriangle(double ab, double c) {
        super(ab, ab, c);
    }

    @Override
    public String toString() {
        return String.format("\nHình tam giác cân\nDiện tích: %.2f\nChu vi: %.2f\n", getArea(), getPerimeter());
    }
}
