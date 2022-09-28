package org.example.ManhattanKata;

public class Point {
    private int a;
    private int b;

    public Point(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculateDistanceFromSecondPoint(Point firstPoint, Point secondPoint){
        int distance = (int) Math.sqrt(Math.pow(secondPoint.a - firstPoint.a, 2)+Math.pow(secondPoint.b - firstPoint.b, 2));
        return Math.abs(distance);
    }

}
