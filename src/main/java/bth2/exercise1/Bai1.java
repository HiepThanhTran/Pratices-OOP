package bth2.exercise1;

import app.App;
import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("- Nhập hoành độ điểm A: ");
        double x1 = sc.nextDouble();
        System.out.print("- Nhập tung độ điểm A: ");
        double y1 = sc.nextDouble();
        Point A = new Point(x1, y1);

        System.out.print("\n- Nhập hoành độ điểm B: ");
        double x2 = sc.nextDouble();
        System.out.print("- Nhập tung độ điểm B: ");
        double y2 = sc.nextDouble();
        Point B = new Point(x2, y2);
        App.printLine(100);
        System.out.println("- Điểm A" + A.toString());
        System.out.println("- Điểm B" + B.toString());
        System.out.println("- Khoảng cách A -> B: " + A.distance(B));
        App.printLine(100);
    }
}
