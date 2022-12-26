package bth3.exercise4;

public enum Term {
    DEMAND(0.001, 0),
    ONE_WEEK(0.005, 7),
    ONE_MONTH(0.045, 30),
    ONE_YEAR(0.068, 365);

    private final double rate;
    private final int day;

    Term(double rate, int day) {
        this.rate = rate;
        this.day = day;
    }

    public double getRate() {
        return rate;
    }

    public int getDay() {
        return day;
    }
}