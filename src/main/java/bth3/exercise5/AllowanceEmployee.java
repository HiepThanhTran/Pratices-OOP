package bth3.exercise5;

public class AllowanceEmployee extends Employee {

    private double bonus;

    public AllowanceEmployee(String id, String name, String origin, String gender, String phoneNumber, int index, double bonus) {
        super(id, name, origin, gender, phoneNumber, index);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
