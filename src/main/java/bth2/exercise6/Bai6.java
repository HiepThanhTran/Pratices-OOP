package bth2.exercise6;

import app.App;
import java.text.ParseException;
import java.util.Scanner;

public class Bai6 {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        StudentManagement managerStudent = new StudentManagement();
        while (true) {
            System.out.println("\n1- Nhập danh sách học viên");
            System.out.println("\n2- Đọc danh sách học viên từ file \"hocvien.txt\"");
            System.out.println("\n3- Nhập điểm cho các học viên");
            System.out.println("\n4- Hiển thị danh sách học viên");
            System.out.println("\n5- Tìm kiếm học viên");
            System.out.println("\n6- Sắp xếp danh sách học viên theo điểm");
            System.out.println("\n7- Xuất danh sách học viên có học bổng ra file \"hocbong.txt\"");
            System.out.println("\n8- Thống kê số lượng học viên");
            System.out.println("\n9- Thoát chương trình");
            System.out.print("\n- Chọn chức năng: ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1": {
                    App.printLine(100);
                    System.out.print("- Nhập số lượng học viên cần thêm: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    managerStudent.setStudentList(n);
                    App.printLine(100);
                    break;
                }
                case "2": {
                    App.printLine(100);
                    managerStudent.readFile();
                    App.printLine(100);
                    break;
                }
                case "3": {
                    App.printLine(100);
                    managerStudent.setScoresList();
                    App.printLine(100);
                    break;
                }
                case "4": {
                    App.printLine(100);
                    managerStudent.showStudentList();
                    App.printLine(100);
                    break;
                }
                case "5": {
                    App.printLine(100);
                    System.out.print("\n- Nhập thông tin tìm kiếm (Mã HV, họ tên, quê quán): ");
                    String c5 = sc.nextLine();
                    Student s = managerStudent.search(c5);
                    if (s != null) {
                        System.out.println(s);
                    } else {
                        System.out.println("\n== KHÔNG TÌM THẤY HỌC VIÊN ==");
                    }
                    App.printLine(100);
                    break;
                }
                case "6": {
                    App.printLine(100);
                    managerStudent.sortStudentList();
                    System.out.println("\n== SẮP XẾP THÀNH CÔNG, VUI LÒNG MỞ DANH SÁCH KIỂM TRA ==");
                    App.printLine(100);
                    break;
                }
                case "7": {
                    App.printLine(100);
                    managerStudent.writeFile();
                    App.printLine(100);
                    break;
                }
                case "8": {
                    App.printLine(100);
                    System.out.println("\n1- Học viên có tuổi nhỏ hơn 18");
                    System.out.println("\n2- Học viên có tuổi từ 18 đến 23");
                    System.out.println("\n3- Học viên có tuổi từ 24 trở lên");
                    System.out.println("\n4- Quay lại");
                    System.out.print("\n- Nhập lựa chọn: ");
                    String c8 = sc.nextLine();
                    System.out.println();
                    switch (c8) {
                        case "1": {
                            managerStudent.statistic(1, 17);
                            break;
                        }
                        case "2": {
                            managerStudent.statistic(18, 23);
                            break;
                        }
                        case "3": {
                            managerStudent.statistic(24);
                            break;
                        }
                        case "4": {
                            break;
                        }
                        default:
                            System.out.println("\n== KHÔNG HỢP LỆ ==");
                    }
                    App.printLine(100);
                    break;
                }
                case "9":
                    return;
                default:
                    System.out.println("\n== KHÔNG HỢP LỆ ==");
            }
            sc.nextLine();
        }
    }
}
