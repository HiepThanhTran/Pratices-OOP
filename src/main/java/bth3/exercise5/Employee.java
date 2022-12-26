package bth3.exercise5;

public class Employee extends Person {

    public static int count = 0;
    protected String stt;
    protected Department part;

    {
        count++;
        stt = String.format("%03d", count);
    }

    public Employee(String id, String name, String origin, String gender, String phoneNumber, int index) {
        super(id, name, origin, gender, phoneNumber);
        this.part = Department.values()[index - 1];
    }

    public Employee(String id, String name, String origin, String gender, String phoneNumber, Department part) {
        super(id, name, origin, gender, phoneNumber);
        this.part = part;
    }

    public String getStt() {
        return stt;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }

    public Department getPart() {
        return part;
    }

    public void setPart(Department part) {
        this.part = part;
    }

    @Override
    public String toString() {
        return String.format("\nHọ tên: %s\nCMND: %s\nGiới tính: %s\nQuê quán: %s\nSĐT: %s\nBộ phận: %s\n", name, id, gender,
            origin, phoneNumber, part.getName());
    }

    public double getSalary(int days) {
        return this.part.getRate() * days;
    }
}
