package bth3.exercise5;

public enum Department {
    NORMAL(1, "Thường"),
    PART_A(1.2, "A"),
    PART_B(1.5, "B"),
    PART_C(2.5, "C"),
    PART_D(1, "D");

    private final double rate;
    private final String name;

    Department(double rate, String name) {
        this.rate = rate;
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public String getName() {
        return name;
    }
}
