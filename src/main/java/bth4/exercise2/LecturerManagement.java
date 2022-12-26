package bth4.exercise2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LecturerManagement {

    private List<Lecturer> lecturers;

    public LecturerManagement() {
        lecturers = new ArrayList<>();
    }

    public LecturerManagement(List<Lecturer> lecturers) {
        this.lecturers = lecturers;
    }

    public List<Lecturer> getLecturers() {
        return lecturers;
    }

    public void setLecturers(List<Lecturer> lecturers) {
        this.lecturers = lecturers;
    }

    public void addLecturer(Lecturer lecturer) {
        lecturers.add(lecturer);
    }

    public void removeLecturer(Lecturer lecturer) {
        lecturers.remove(lecturer);
    }

    public List<Lecturer> search(String key) {
        return lecturers.stream().filter(
            lecturer -> lecturer.getName().equalsIgnoreCase(key) || lecturer.getTitle().equalsIgnoreCase(key)
                || lecturer.getDegree().equalsIgnoreCase(key)).collect(Collectors.toList());
    }

    public void calculateSalary() {
        DecimalFormat dcf = new DecimalFormat("###,###.##");
        Scanner sc = new Scanner(System.in);
        List<Double> salary = new ArrayList<>();
        for (int i = 0; i < lecturers.size(); i++) {
            System.out.printf("\n- Nhập số giờ làm việc của giảng viên thứ %d: ", i + 1);
            double hours = Double.parseDouble(sc.nextLine());
            salary.add(lecturers.get(i).calculateSalary(hours));
            lecturers.sort((l1, l2) -> l1.calculateSalary(hours) < l2.calculateSalary(hours) ? 1 : -1);
        }
        salary.sort((o1, o2) -> (int) (o2 - o1));
        System.out.println("\n** DANH SÁCH GIẢNG VIÊN KÈM LƯƠNG **");
        for (int i = 0; i < lecturers.size(); i++) {
            System.out.printf("\n== Thông tin giảng viên thứ %d ==", i + 1);
            System.out.print(lecturers.get(i).toString());
            System.out.printf("- Tiền lương: %s\n", dcf.format(salary.get(i)));
        }
    }
}
