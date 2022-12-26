package bth2.exercise2;

import app.App;
import bth2.exercise1.Point;
import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        App.printLine(100);

        System.out.print("- Nhập tọa độ điểm A: ");
        double xa = sc.nextDouble(), ya = sc.nextDouble();
        System.out.print("- Nhập tọa độ điểm B: ");
        double xb = sc.nextDouble(), yb = sc.nextDouble();

        Point A = new Point(xa, ya);
        Point B = new Point(xb, yb);
        Line AB = new Line(A, B);

        System.out.print("- Nhập tọa độ điểm C: ");
        double xc = sc.nextDouble(), yc = sc.nextDouble();
        System.out.print("- Nhập tọa độ điểm D: ");
        double xd = sc.nextDouble(), yd = sc.nextDouble();

        Point C = new Point(xc, yc);
        Point D = new Point(xd, yd);
        Line CD = new Line(C, D);

        App.printLine(100);
        System.out.println("- Đoạn thẳng AB: " + AB.toString());
        System.out.println("- Độ dài: " + AB.getLength());
        System.out.println("- Trung điểm AB: " + AB.midPoint().toString());
        App.printLine(100);
        System.out.println("- Đoạn thẳng CD: " + CD.toString());
        System.out.println("- Độ dài: " + CD.getLength());
        System.out.println("- Trung điểm AB: " + CD.midPoint().toString());
        App.printLine(100);
        if (AB.isParallel(CD)) {
            System.out.println("- Hai đoạn thẳng song song nhau");
        } else {
            System.out.println("- Hai đoạn thẳng không song song");
        }
    }
}
