package bth4.exercise2;

import app.App;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) throws ParseException {
        LecturerManagement lecturerManagement = new LecturerManagement();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Thêm giảng viên");
            System.out.println("\n2. Xóa giảng viên");
            System.out.println("\n3. Tra cứu thông tin giảng viên");
            System.out.println("\n4. Tính tiền lương");
            System.out.println("\n5. Thoát");
            System.out.print("\n- Chọn chức năng: ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1": {
                    App.printLine(100);
                    System.out.print("\n- Nhập họ tên giảng viên: ");
                    String name = sc.nextLine();
                    System.out.print("- Nhập ngày sinh: ");
                    Date dob = sdf.parse(sc.nextLine());
                    System.out.print("- Nhập học hàm: ");
                    String title = sc.nextLine();
                    System.out.print("- Nhập học vị: ");
                    String degree = sc.nextLine();
                    System.out.print("- Nhập ngày bắt đầu công tác: ");
                    Date startDate = sdf.parse(sc.nextLine());
                    System.out.println("\n1. Giảng viên cơ hữu");
                    System.out.println("\n2. Giảng viên thỉnh giảng");
                    System.out.print("\n- Chọn loại giảng viên: ");
                    String c1 = sc.nextLine();
                    switch (c1) {
                        case "1": {
                            System.out.print("- Nhập lương cơ bản: ");
                            double basicSalary = Double.parseDouble(sc.nextLine());
                            System.out.print("- Nhập hệ số lương: ");
                            double coefficients = Double.parseDouble(sc.nextLine());
                            FullTimeLecturer lecturer = new FullTimeLecturer(name, dob, title, degree, startDate, basicSalary,
                                coefficients);
                            lecturerManagement.addLecturer(lecturer);
                            System.out.println("\n== Thêm giảng viên thành công ==");
                            break;
                        }
                        case "2": {
                            System.out.print("- Nhập nơi công tác: ");
                            String place = sc.nextLine();
                            VisitingLecturer lecturer = new VisitingLecturer(name, dob, title, degree, startDate, place);
                            lecturerManagement.addLecturer(lecturer);
                            System.out.println("\n== Thêm giảng viên thành công ==");
                            break;
                        }
                        default:
                            System.out.println("\n== Không thành công. Nhập lại! ==");
                    }
                    App.printLine(100);
                    break;
                }
                case "2": {
                    App.printLine(100);
                    for (int i = 0; i < lecturerManagement.getLecturers().size(); i++) {
                        System.out.printf("\n%d. %s\n", i + 1, lecturerManagement.getLecturers().get(i).getName());
                    }
                    System.out.print("\n- Chọn giảng viên cần xóa: ");
                    String index = sc.nextLine();
                    if (index.matches("[1-" + lecturerManagement.getLecturers().size() + "]")) {
                        lecturerManagement.removeLecturer(lecturerManagement.getLecturers().get(Integer.parseInt(index) - 1));
                        System.out.println("\n== Xóa giảng viên thành công ==");
                    }
                    App.printLine(100);
                    break;
                }
                case "3": {
                    App.printLine(100);
                    System.out.print("\n- Nhập tên/học hàm/học vị giảng viên cần tra cứu: ");
                    String key = sc.nextLine();
                    List<Lecturer> temp = lecturerManagement.search(key);
                    if (temp.size() != 0) {
                        System.out.println("\n** DANH SÁCH TRA CỨU GIẢNG VIÊN **");
                        temp.forEach(lecturer -> System.out.println(lecturer.toString()));
                    } else {
                        System.out.println("\n== Danh sách rỗng! ==");
                    }
                    App.printLine(100);
                    break;
                }
                case "4": {
                    App.printLine(100);
                    lecturerManagement.calculateSalary();
                    App.printLine(100);
                    break;
                }
                case "5":
                    return;
                default:
                    System.out.println("\n** KHÔNG HỢP LỆ **");
            }
            sc.nextLine();
        }
    }
}
