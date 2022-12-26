package bth4.exercise2;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Lecturer {

    protected final double SALARY = 90000;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private String name;
    private Date dob;
    private String title;
    private String degree;
    private Date startDate;

    public Lecturer(String name, Date dob, String title, String degree, Date startDate) {
        this.name = name;
        this.dob = dob;
        this.title = title;
        this.degree = degree;
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public abstract double calculateSalary(double hours);

    @Override
    public String toString() {
        return String.format("\nHọ tên: %s\nNgày sinh: %s\nHọc hàm: %s\nHọc vị: %s\nNgày bắt đầu công tác: %s\n", name,
            sdf.format(dob), title, degree, sdf.format(startDate));
    }
}
