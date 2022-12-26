package bth2.exercise3;

import app.App;
import bth2.exercise1.Point;
import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        App.printLine(100);
        System.out.print("- Nhập tọa độ điểm trên trái: ");
        double x1 = sc.nextDouble(), y1 = sc.nextDouble();
        System.out.print("- Nhập tọa độ điểm dưới phải: ");
        double x2 = sc.nextDouble(), y2 = sc.nextDouble();

        Point A = new Point(x1, y1);
        Point B = new Point(x2, y2);
        Rectangle rectangle = new Rectangle(A, B);

        App.printLine(100);
        System.out.println("** THÔNG TIN HÌNH CHỮ NHẬT **");
        System.out.println(rectangle.toString());
        App.printLine(100);
    }
}
