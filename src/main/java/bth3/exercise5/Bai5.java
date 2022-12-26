package bth3.exercise5;

import app.App;
import java.util.Scanner;

public class Bai5 {

    public static void main(String[] args) {
        EmployeeManagement managerEmployee = new EmployeeManagement();
        Scanner sc = new Scanner(System.in);
        Employee employee1 = new Employee("079203037932", "Trần Thanh Hiệp", "TP.HCM", "Nam", "0388227064", 1);
        managerEmployee.addEmployee(employee1);
        Employee employee2 = new Employee("0123456789", "Đặng Trung Thắng", "Long An", "Nam", "0123456789", 1);
        managerEmployee.addEmployee(employee2);
        Employee employee3 = new AllowanceEmployee("9876543210", "Nguyễn Huỳnh Ngọc Như", "TP.HCM", "Nữ", "9876543210", 1,
            300000);
        managerEmployee.addEmployee(employee3);
        while (true) {
            System.out.println("\n1. Thêm nhân viên");
            System.out.println("\n2. Xoá nhân viên");
            System.out.println("\n3. Tra cứu nhân viên");
            System.out.println("\n4. Hiển thị danh sách nhân viên");
            System.out.println("\n5. Tính lương nhân viên");
            System.out.println("\n6. Thoát");
            System.out.print("\n- Chọn chức năng: ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1": {
                    App.printLine(100);
                    System.out.print("- Nhập số CCCD/CMND: ");
                    String id = sc.nextLine();
                    System.out.print("- Nhập họ và tên: ");
                    String name = sc.nextLine();
                    System.out.print("- Nhập quê quán: ");
                    String origin = sc.nextLine();
                    System.out.print("- Nhập giới tính: ");
                    String gender = sc.nextLine();
                    System.out.print("- Nhâp SĐT: ");
                    String phoneNumber = sc.nextLine();
                    System.out.println("\n1- Nhân viên bình thường");
                    System.out.println("\n2- Bộ phận A");
                    System.out.println("\n3- Bộ phận B");
                    System.out.println("\n4- Bộ phận C");
                    System.out.println("\n5- Bộ phận D");
                    System.out.print("\n- Chọn vị trí cho nhân viên: ");
                    String c1 = sc.nextLine();
                    if (c1.matches("[1-5]")) {
                        int index = Integer.parseInt(c1);
                        Employee employee;
                        if (c1.equals("5")) {
                            System.out.print("- Nhập phụ cấp cho nhân viên: ");
                            double bonus = Double.parseDouble(sc.nextLine());
                            employee = new AllowanceEmployee(id, name, origin, gender, phoneNumber, index, bonus);
                        } else {
                            employee = new Employee(id, name, origin, gender, phoneNumber, index);
                        }
                        managerEmployee.addEmployee(employee);
                        System.out.println("\n** THÊM NHÂN VIÊN THÀNH CÔNG **");
                    }
                    App.printLine(100);
                    break;
                }
                case "2": {
                    App.printLine(100);
                    System.out.print("- Nhập mã số hoặc CCCD/CMND nhân viên cần xóa: ");
                    String s = sc.nextLine();
                    if (managerEmployee.removeEmployee(s)) {
                        System.out.println("\n** XÓA NHÂN VIÊN THÀNH CÔNG");
                    } else {
                        System.out.println("\n** XÓA NHÂN VIÊN KHÔNG THÀNH CÔNG");
                    }
                    App.printLine(100);
                    break;
                }
                case "3": {
                    App.printLine(100);
                    System.out.print("- Nhập thông tin nhân viên cần tra cứu (CCCD/CMND, tên, hoặc quê quán: ");
                    String s = sc.nextLine();
                    Employee other = managerEmployee.search(s);
                    if (other != null) {
                        System.out.println("\n** THÔNG TIN NHÂN VIÊN CẦN TRA CỨU **");
                        System.out.println(other.toString());
                    } else {
                        System.out.println("\n** KHÔNG TÌM THẤY NHÂN VIÊN **");
                    }
                    App.printLine(100);
                    break;
                }
                case "4": {
                    App.printLine(100);
                    System.out.println("\n** DANH SÁCH NHÂN VIÊN ĐANG LƯU TRỮ **");
                    managerEmployee.showEmployeeList();
                    App.printLine(100);
                    break;
                }
                case "5": {
                    App.printLine(100);
                    managerEmployee.calculateSalary();
                    App.printLine(100);
                    break;
                }
                case "6":
                    return;
                default:
                    System.out.println("\n** KHÔNG HỢP LỆ **");
            }
            sc.nextLine();
        }
    }
}
