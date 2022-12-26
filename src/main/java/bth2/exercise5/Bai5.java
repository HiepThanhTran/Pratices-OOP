package bth2.exercise5;

import app.App;
import java.util.Scanner;
import bth2.exercise4.Fraction;

public class Bai5 {

    public static void main(String[] args) {
        FractionList fractions = new FractionList();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1- Thêm một phân số vào danh sách");
            System.out.println("\n2- Xóa một phân số khỏi danh sách");
            System.out.println("\n3- Tính tổng các phân số trong danh sách");
            System.out.println("\n4- Sắp xếp danh sách tăng dần");
            System.out.println("\n5- Hiển thị danh sách phân số");
            System.out.println("\n6- Thoát chương trình");
            System.out.print("\n- Chọn chức năng: ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1": {
                    App.printLine(100);
                    System.out.print("- Nhập tử và mẫu phân số: ");
                    int t = sc.nextInt(), m = sc.nextInt();
                    Fraction ps = new Fraction(t, m);
                    fractions.addFraction(ps);
                    System.out.println("\n** THÊM PHÂN SỐ VÀO DANH SÁCH THÀNH CÔNG **");
                    App.printLine(100);
                    sc.nextLine();
                    break;
                }
                case "2": {
                    App.printLine(100);
                    System.out.print("- Nhập tử và mẫu phân số: ");
                    int t = sc.nextInt(), m = sc.nextInt();
                    Fraction ps = new Fraction(t, m);
                    fractions.removeFraction(ps);
                    App.printLine(100);
                    sc.nextLine();
                    break;
                }
                case "3": {
                    App.printLine(100);
                    System.out.println("- Tổng các phân số: " + fractions.sumOfFractions().toString());
                    App.printLine(100);
                    break;
                }
                case "4": {
                    App.printLine(100);
                    System.out.println("- Danh sách trước khi sắp xếp: " + fractions);
                    fractions.sortFractionList();
                    System.out.println("- Danh sách sau khi sắp xếp tăng dần: " + fractions);
                    App.printLine(100);
                    break;
                }
                case "5": {
                    App.printLine(100);
                    System.out.println("- Danh sách phân số đang lưu trữ: " + fractions);
                    App.printLine(100);
                    break;
                }
                case "6":
                    return;
                default:
                    System.out.println("\n== KHÔNG HỢP LỆ ==");
            }
        }
    }
}
