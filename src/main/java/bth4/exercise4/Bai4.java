package bth4.exercise4;

import app.App;
import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        App.printLine(100);
        System.out.println("\n1. Hình chữ nhật");
        System.out.println("\n2. Hình tròn");
        System.out.print("\n- Chọn hình bạn muốn: ");
        String shape = sc.nextLine();
        App.printLine(100);
        switch (shape) {
            case "1": {
                App.printLine(100);
                System.out.print("\n- Nhập tọa độ điểm trên trái (x, y): ");
                double x = Double.parseDouble(sc.next()), y = Double.parseDouble(sc.nextLine());
                System.out.print("\n- Nhập chiều dài: ");
                double length = Double.parseDouble(sc.nextLine());
                System.out.print("\n- Nhập chiều rộng: ");
                double width = Double.parseDouble(sc.nextLine());
                Point topLeft = new Point(x, y);
                Rectangle rectangle = new Rectangle("HCN", topLeft, length, width);
                boolean b = false;
                while (!b) {
                    System.out.println("\n1- Di chuyển lên trên");
                    System.out.println("\n2- Di chuyển xuống dưới");
                    System.out.println("\n3- Di chuyển qua trái");
                    System.out.println("\n4- Di chuyển qua phải");
                    System.out.println("\n5- Kết thúc");
                    System.out.print("\n-> ");
                    String move = sc.nextLine();
                    switch (move) {
                        case "1": {
                            System.out.printf("- Tọa độ cũ: %s\n", topLeft.toString());
                            rectangle.moveUp();
                            System.out.printf("- Di chuyển lên trên 1 đơn vị: %s\n", rectangle.getTopLeft().toString());
                            break;
                        }
                        case "2": {
                            System.out.printf("- Tọa độ cũ: %s\n", topLeft.toString());
                            rectangle.moveDown();
                            System.out.printf("- Di chuyển xuống dươi 1 đơn vị: %s\n", rectangle.getTopLeft().toString());
                            break;
                        }
                        case "3": {
                            System.out.printf("- Tọa độ cũ: %s\n", topLeft.toString());
                            rectangle.moveLeft();
                            System.out.printf("- Di chuyển qua trái 1 đơn vị: %s\n", rectangle.getTopLeft().toString());
                            break;
                        }
                        case "4": {
                            System.out.printf("- Tọa độ cũ: %s\n", topLeft.toString());
                            rectangle.moveRight();
                            System.out.printf("- Di chuyển qua phải 1 đơn vị: %s\n", rectangle.getTopLeft().toString());
                            break;
                        }
                        default:
                            b = true;
                    }
                }
                App.printLine(100);
                break;
            }
            case "2": {
                App.printLine(100);
                System.out.print("\n- Nhập tọa độ tâm hình tròn (x, y): ");
                double x = Double.parseDouble(sc.next()), y = Double.parseDouble(sc.nextLine());
                System.out.print("\n- Nhập bán kính: ");
                double radius = Double.parseDouble(sc.nextLine());
                Point center = new Point(x, y);
                Circle circle = new Circle("Hình tròn", center, radius);
                boolean b = false;
                while (!b) {
                    System.out.println("\n1- Di chuyển lên trên");
                    System.out.println("\n2- Di chuyển xuống dưới");
                    System.out.println("\n3- Di chuyển qua trái");
                    System.out.println("\n4- Di chuyển qua phải");
                    System.out.println("\n5- Kết thúc");
                    System.out.print("\n-> ");
                    String move = sc.nextLine();
                    switch (move) {
                        case "1": {
                            System.out.printf("- Tọa độ cũ: %s\n", center.toString());
                            circle.moveUp();
                            System.out.printf("- Di chuyển lên trên 1 đơn vị: %s\n", circle.getCenter().toString());
                            break;
                        }
                        case "2": {
                            System.out.printf("- Tọa độ cũ: %s\n", center.toString());
                            circle.moveDown();
                            System.out.printf("- Di chuyển xuống dươi 1 đơn vị: %s\n", circle.getCenter().toString());
                            break;
                        }
                        case "3": {
                            System.out.printf("- Tọa độ cũ: %s\n", center.toString());
                            circle.moveLeft();
                            System.out.printf("- Di chuyển qua trái 1 đơn vị: %s\n", circle.getCenter().toString());
                            break;
                        }
                        case "4": {
                            System.out.printf("- Tọa độ cũ: %s\n", center.toString());
                            circle.moveRight();
                            System.out.printf("- Di chuyển qua phải 1 đơn vị: %s\n", circle.getCenter().toString());
                            break;
                        }
                        default:
                            b = true;
                    }
                }
                App.printLine(100);
                break;
            }
            default:
                System.out.println("\n** KHÔNG HỢP LỆ! **");
        }
    }
}
