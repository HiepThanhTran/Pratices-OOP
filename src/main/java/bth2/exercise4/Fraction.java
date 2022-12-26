package bth2.exercise4;

public class Fraction implements Comparable<Fraction> {

    public static int amountFraction = 0;
    private int numerator;
    private int denominator;

    public Fraction() {
        this(0, 1);
    }

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            denominator = 1;
        }
        if (denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        amountFraction++;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            denominator = 1;
        }
        if (denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDeNominator() {
        return denominator;
    }

    public Fraction simplify() {
        int t = gcd(this.numerator, this.denominator);
        this.numerator = this.numerator / t;
        this.denominator = this.denominator / t;
        return this;
    }

    public Fraction add(Fraction op) {
        return new Fraction(this.numerator * op.denominator + this.denominator * op.numerator,
            this.denominator * op.denominator).simplify();
    }

    public Fraction sub(Fraction op) {
        return new Fraction(this.numerator * op.denominator - this.denominator * op.numerator,
            this.denominator * op.denominator).simplify();
    }

    public Fraction mul(Fraction op) {
        return new Fraction(this.numerator * op.numerator,
            this.denominator * op.denominator).simplify();
    }

    public Fraction div(Fraction op) {
        return new Fraction(this.numerator * op.denominator,
            this.denominator * op.numerator).simplify();
    }

    @Override
    public int compareTo(Fraction op) {
        Fraction p = this.sub(op);
        return p.numerator * p.denominator;
    }

    @Override
    public String toString() {
        return this.simplify().numerator + "/" + this.simplify().denominator;
    }
}
