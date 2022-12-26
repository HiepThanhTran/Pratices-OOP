package bth2.exercise6;

import static bth2.exercise6.Factory.f;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentManagement {

    private final List<Student> students;

    public StudentManagement() {
        students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public Student search(String s) {
        return this.students.stream().filter(st -> st.getId().equals(s) || st.getName().equals(s) || st.getOrigin().equals(s))
            .findFirst().orElse(null);
    }

//    public Student search(int id) {
//        return this.students.stream().filter(student -> student.getId() == id).findFirst().orElse(null);
//    }

    public void setStudentList(int n) throws ParseException {
        for (int i = 0; i < n; i++) {
            Student st = new Student();
            System.out.println("\n** NHẬP THÔNG TIN HỌC VIÊN " + st.getId() + " **");
            st.setStudent();
            this.addStudent(st);
        }
    }

    public void showStudentList() {
        students.forEach(student -> student.showStudent());
    }

    public void setScoresList() {
        students.forEach(st -> {
            System.out.printf("\n** NHẬP ĐIỂM CHO HỌC VIÊN %s **\n", st.getId());
            st.setScore();
        });
    }

    public void sortStudentList() {
        students.sort((st1, st2) -> st1.getAvg() > st2.getAvg() ? 1 : (st1.getAvg() < st2.getAvg() ? -1 : 0));
    }

    public void readFile() {
        try {
            File file = new File("src/main/resources/Students.txt");
            Scanner read = new Scanner(file);
            while (read.hasNextLine()) {
                Student st = new Student();
                st.setName(read.nextLine());
                st.setOrigin(read.nextLine());
                st.setDob(f.parse(read.nextLine()));
                addStudent(st);
            }
            System.out.println("== ĐỌC FILE THÀNH CÔNG ==");
        } catch (FileNotFoundException | ParseException e) {
            System.out.println("== LỖI ==");
        }
    }

    public List<Student> scholarshipList() {
        return this.students.stream().filter(st -> st.isScholarship()).collect(Collectors.toList());
    }

    public void writeFile() {
        try {
            File f = new File("src/main/resources/Scholarship.txt");
            List<Student> scholarList = scholarshipList();
            PrintWriter writer = new PrintWriter(f);
            for (Student st : scholarList) {
                writer.println(st.getId() + " - " + st.getName() + " - " + st.getAvg());
            }
            System.out.println("== GHI FILE THÀNH CÔNG ==");
        } catch (FileNotFoundException e) {
            System.out.println("\n== KHÔNG TÌM THẤY FILE ==");
        }
    }

    /**
     * Thống kê các học viên có độ tuổi từ a đến b
     *
     * @param a
     * @param b
     */
    public void statistic(int a, int b) {
        for (Student st : students) {
            if (st.getAge() >= a && st.getAge() <= b) {
                st.showStudent();
            }
        }
    }

    /**
     * Thống kế các học viên có độ tuổi từ 24 trở lên
     *
     * @param a
     */
    public void statistic(int a) {
        for (Student st : students) {
            if (st.getAge() >= a) {
                st.showStudent();
            }
        }
    }
}
