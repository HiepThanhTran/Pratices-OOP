package bth3.exercise2;

public class Triangle {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        if (a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a)) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public double getArea() {
        double p = getPerimeter();
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return String.format("\nHình tam giác\nDiện tích: %.2f\nChu vi: %.2f\n", getArea(), getPerimeter());
    }
}
