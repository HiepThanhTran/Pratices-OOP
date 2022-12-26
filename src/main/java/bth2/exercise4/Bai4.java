package bth2.exercise4;

import app.App;
import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        App.printLine(100);
        System.out.print("- Nhập phân số thứ 1: ");
        int t1 = sc.nextInt(), m1 = sc.nextInt();
        Fraction p1 = new Fraction(t1, m1);

        System.out.print("\n- Nhập phân số thứ 2: ");
        int t2 = sc.nextInt(), m2 = sc.nextInt();
        Fraction p2 = new Fraction(t2, m2);

        System.out.println("\n- Phân số 1 sau khi rút gọn: " + p1);
        System.out.println("- Phân số 2 sau khi rút gọn: " + p2);
        App.printLine(100);
        sc.nextLine();
        while (true) {
            System.out.println("\n1- Cộng 2 phân số");
            System.out.println("\n2- Trừ 2 phân số");
            System.out.println("\n3- Nhân 2 phân số");
            System.out.println("\n4- Chia 2 phân số");
            System.out.println("\n5- So sánh 2 phân số");
            System.out.println("\n6- Thoát chương trình");
            System.out.print("\n- Chọn chức năng: ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1": {
                    App.printLine(100);
                    System.out.println("- Kết quả cộng 2 phân số: " + p1.add(p2).toString());
                    App.printLine(100);
                    break;
                }
                case "2": {
                    App.printLine(100);
                    System.out.println("- Kết quả trừ 2 phân số: " + p1.sub(p2).toString());
                    App.printLine(100);
                    break;
                }
                case "3": {
                    App.printLine(100);
                    System.out.println("- Kết quả nhân 2 phân số: " + p1.mul(p2).toString());
                    App.printLine(100);
                    break;
                }
                case "4": {
                    App.printLine(100);
                    System.out.println("- Kết quả chia 2 phân số: " + p1.div(p2).toString());
                    App.printLine(100);
                    break;
                }
                case "5": {
                    App.printLine(100);
                    if (p1.compareTo(p2) == 0) {
                        System.out.println("- Hai phân số bằng nhau");
                    } else if (p1.compareTo(p2) > 0) {
                        System.out.println("- Phân số " + p1 + " lớn hơn phân số " + p2);
                    } else if (p1.compareTo(p2) < 0) {
                        System.out.println("- Phân số " + p2 + " lớn hơn phân số " + p1);
                    }
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
