package com.madushan.Flyweight.PointData;

public class Point {

    private int x, y;

    private PointService pointService;

    private PointIcon pointIcon;

    public Point(int x, int y, PointIcon pointIcon) {
        this.x = x;
        this.y = y;
        this.pointIcon = pointIcon;
    }

    public void drawPoint() {
        System.out.println(String.format("%s at (%d, %d)", pointIcon.getType(), x, y));
    }
}
