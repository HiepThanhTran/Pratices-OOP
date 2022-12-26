package bth4.exercise1;

import app.App;
import java.util.List;

public class Bai1 {

    public static void main(String[] args) {
        ShapeManagement shapeManagement = new ShapeManagement();
        Rectangle rectangle1 = new Rectangle("chữ nhật", 3, 4);
        Rectangle rectangle2 = new Rectangle("chữ nhật", 12, 5);
        Squares squares = new Squares("vuông", 4);
        Ellipse ellipse = new Ellipse("ellipse", 9, 7);
        Circle circle1 = new Circle("tròn", 5);
        Circle circle2 = new Circle("tròn", 9);
        Triangle triangle = new Triangle("tam giác thường", 3, 4, 5);
        IsoTriangle isoTriangle = new IsoTriangle("tam giác cân", 4, 5);
        EquilTriangle equilTriangle = new EquilTriangle("tam giác đều", 7);
        shapeManagement.add(rectangle1);
        shapeManagement.add(rectangle2);
        shapeManagement.add(squares);
        shapeManagement.add(ellipse);
        shapeManagement.add(circle1);
        shapeManagement.add(circle2);
        shapeManagement.add(triangle);
        shapeManagement.add(isoTriangle);
        shapeManagement.add(equilTriangle);
        App.printLine(100);
        shapeManagement.showList();
        App.printLine(100);
        shapeManagement.remove(circle2);
        shapeManagement.showList();
        App.printLine(100);
        List<Shape> list = shapeManagement.getListByShape("Chữ nhật");
        list.forEach(shape -> System.out.println(shape.toString()));
        App.printLine(100);
        shapeManagement.sortByArea();
        shapeManagement.showList();
        App.printLine(100);
        shapeManagement.sortByPerimeter();
        shapeManagement.showList();
    }
}
