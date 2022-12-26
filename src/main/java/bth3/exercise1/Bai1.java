package bth3.exercise1;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n- Nhập bán kính trục lớn: ");
        double x = sc.nextDouble();
        System.out.print("\n- Nhập bán kính trục nhỏ: ");
        double y = sc.nextDouble();
        Ellipse ellipse = new Ellipse(x, y);
        System.out.println(ellipse.toString());
        System.out.print("\n- Nhập bán kính hình tròn: ");
        double radius = sc.nextDouble();
        Ellipse circle = new Circle(radius);
        System.out.println(circle.toString());
    }
}
