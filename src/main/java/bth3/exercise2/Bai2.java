package bth3.exercise2;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n- Nhập chiều dài HCN: ");
        double length = sc.nextDouble();
        System.out.print("\n- Nhập chiều rộng HCN: ");
        double width = sc.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        System.out.println(rectangle.toString());
        System.out.print("\n- Nhập cạnh hình vuông: ");
        double edge = sc.nextDouble();
        Rectangle squares = new Squares(edge);
        System.out.println(squares.toString());
        System.out.print("\n- Nhập cạnh thứ 1 tam giác: ");
        double a = sc.nextDouble();
        System.out.print("\n- Nhập cạnh thứ 2 tam giác: ");
        double b = sc.nextDouble();
        System.out.print("\n- Nhập cạnh thứ 3 tam giác: ");
        double c = sc.nextDouble();
        Triangle triangle = new Triangle(a, b, c);
        Triangle isoTriangle = new IsoTriangle(a > b ? a : b, c);
        Triangle equilTriangle = new EquilTriangle(Math.max(Math.max(a, b), c));
        System.out.println(triangle.toString());
        System.out.println(isoTriangle.toString());
        System.out.println(equilTriangle.toString());
    }
}
