package bth4.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShapeManagement {

    private List<Shape> shapes;

    public ShapeManagement() {
        shapes = new ArrayList<>();
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public void add(Shape shape) {
        this.shapes.add(shape);
    }

    public void remove(Shape shape) {
        this.shapes.remove(shape);
    }

    public void showList() {
        shapes.forEach(shape -> System.out.println(shape.toString()));
    }

    public List<Shape> getListByShape(String name) {
        return shapes.stream().filter(shape -> shape.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
    }

    public void sortByArea() {
        shapes.sort((s1, s2) -> s1.getArea() > s2.getArea() ? 1 : (s1.getArea() < s2.getArea() ? -1 : 0));
    }

    public void sortByPerimeter() {
        shapes.sort((s1, s2) -> s1.getPerimeter() < s2.getPerimeter() ? 1 : (s1.getPerimeter() > s2.getPerimeter() ? -1 : 0));
    }
}
