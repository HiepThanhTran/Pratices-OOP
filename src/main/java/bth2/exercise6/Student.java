package bth2.exercise6;

import static bth2.exercise6.Factory.AMOUNT_SUBJECT;
import static bth2.exercise6.Factory.c;
import static bth2.exercise6.Factory.f;
import static bth2.exercise6.Factory.sc;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.stream.DoubleStream;

public class Student {

    private static int count = 1;
    private final String id;
    private String name;
    private Date dob; // Date of birth
    private String origin;
    private double[] scores;

    {
        id = String.valueOf(count);
        count++;
    }

    public Student() throws ParseException {
        this("Unknown", "00/00/0000", "Unknown");
    }

    public Student(String name, Date dob, String origin) {
        this.name = name;
        this.dob = dob;
        this.origin = origin;
    }

    public Student(String name, String dob, String origin) throws ParseException {
        this(name, f.parse(dob), origin);
    }

    public String getId() {
        return id;
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

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double[] getScores() {
        return scores;
    }

    public void setScores(double[] scores) {
        this.scores = scores;
    }

    public double getAvg() {
        return DoubleStream.of(scores).average().getAsDouble();
    }

    public int getAge() {
        GregorianCalendar birthday = new GregorianCalendar();
        birthday.setTime(dob);
        int age = c.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);
        if (c.get(Calendar.MONTH) < birthday.get(Calendar.MONTH)) {
            age--;
        } else if (c.get(Calendar.MONTH) == birthday.get(Calendar.MONTH)) {
            if (c.get(Calendar.DAY_OF_MONTH) < birthday.get(Calendar.DAY_OF_MONTH)) {
                age--;
            }
        }
        return age;
    }

    public void setStudent() throws ParseException {
        System.out.print("\n- Nhập tên học viên: ");
        this.name = sc.nextLine();
        System.out.print("\n- Nhập ngày sinh (dd/mm/yyyy): ");
        this.dob = f.parse(sc.nextLine());
        System.out.print("\n- Nhập quê quán: ");
        this.origin = sc.nextLine();
    }

    public void showStudent() {
        System.out.printf("\n** THÔNG TIN HỌC VIÊN %d **\n", this.id);
        System.out.println(this);
        System.out.println("\n- Điểm 3 môn: ");
        DoubleStream.of(scores).forEach(score -> System.out.print(score + " "));
    }

    public void setScore() {
        for (int i = 0; i < AMOUNT_SUBJECT; i++) {
            System.out.printf("\n** NHẬP ĐIỂM MÔN THỨ %d **\n", i + 1);
            this.scores[i] = Double.parseDouble(sc.nextLine());
        }
    }

    public boolean isScholarship() {
        for (double x : scores) {
            if (x < 5) {
                return false;
            }
        }
        return this.getAvg() >= 8;
    }

    @Override
    public String toString() {
        return String.format("\n- Tên học viên: %s\n- Ngày sinh: %s\n- Quê quán: %s", name, f.format(dob), origin);
    }
}
