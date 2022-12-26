package bth4.exercise2;

import java.text.DecimalFormat;
import java.util.Date;

public class FullTimeLecturer extends Lecturer {

    private double basicSalary;
    private double coefficients;

    public FullTimeLecturer(String name, Date dob, String title, String degree, Date startDate,
        double basicSalary, double coefficients) {
        super(name, dob, title, degree, startDate);
        this.basicSalary = basicSalary;
        this.coefficients = coefficients;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getCoefficients() {
        return coefficients;
    }

    public void setCoefficients(double coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public double calculateSalary(double hours) {
        return hours * SALARY + basicSalary * coefficients;
    }

    @Override
    public String toString() {
        DecimalFormat dcf = new DecimalFormat("###,###.##");
        String infoLecturer = super.toString();
        return String.format("%sLương cơ bản: %s\nHệ số: %.2f\n", infoLecturer, dcf.format(basicSalary), coefficients);
    }
}
