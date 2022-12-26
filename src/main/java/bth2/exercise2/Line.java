package bth2.exercise2;

import bth2.exercise1.Point;

public class Line {

    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "[" + begin.toString() + ", " + end.toString() + "]";
    }

    public double getLength() {
        return Math.sqrt(Math.pow(begin.getX() - end.getX(), 2) + Math.pow(begin.getY() - end.getY(), 2));
    }

    /*
     Xmid = (Xa + Xb) / 2
     Ymid = (Ya + Yb) / 2;
     */
    public Point midPoint() {
        Point mid = new Point((begin.getX() + end.getX()) / 2, (begin.getY() + end.getY()) / 2);
        return mid;
    }

    public boolean isParallel(Line B) {
        double AB = (begin.getX() - end.getX()) / (begin.getY() - end.getY());
        double CD = (B.begin.getX() - B.end.getX()) / (B.begin.getY() - B.end.getY());
        return AB == CD;
    }
}
