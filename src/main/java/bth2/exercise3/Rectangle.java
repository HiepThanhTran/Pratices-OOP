package bth2.exercise3;

import bth2.exercise1.Point;

public class Rectangle {

    private Point topLeft;
    private Point bottomRight;

    public Rectangle(Point topLeft, Point bottomRight) throws Exception {
        if (isRectangle()) {
            this.topLeft = topLeft;
            this.bottomRight = bottomRight;
        } else {
            throw new Exception("DỮ LIỆU KHÔNG HỢP LỆ!");
        }
    }

    public boolean isRectangle() {
        return topLeft.getX() < bottomRight.getX() && topLeft.getY() > bottomRight.getY();
    }

    public double getLength() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
//            return Math.sqrt(Math.pow(topLeft.getX() - bottomRight.getX(), 2));
    }

    public double getWidth() {
        return Math.abs(topLeft.getY() - bottomRight.getY());
//            return Math.sqrt(Math.pow(topLeft.getY() - bottomRight.getY(), 2));
    }

    public double getArea() {
        return this.getLength() * this.getWidth();
    }

    public double getPerimeter() {
        return 2 * (this.getLength() + this.getWidth());
    }

    @Override
    public String toString() {
        return "- Tọa độ điểm trên trái: " + topLeft.toString() +
            "\n- Tọa độ điểm dưới phải: " + bottomRight.toString() +
            "\n- Chiều dài hình chữ nhật: " + getLength() +
            "\n- Chiều rộng hình chữ nhật: " + getWidth() +
            "\n- Diện tích hình chữ nhật: " + getArea() +
            "\n- Chu vi hình chữ nhật: " + getPerimeter();
    }
}
