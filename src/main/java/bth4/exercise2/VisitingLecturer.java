package bth4.exercise2;

import java.util.Date;

public class VisitingLecturer extends Lecturer {

    private String place;

    public VisitingLecturer(String name, Date dob, String title, String degree, Date startDate, String place) {
        super(name, dob, title, degree, startDate);
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public double calculateSalary(double hours) {
        return hours * SALARY;
    }

    @Override
    public String toString() {
        String infoLecturer = super.toString();
        return String.format("%sNơi công tác: %s\n", infoLecturer, place);
    }
}
