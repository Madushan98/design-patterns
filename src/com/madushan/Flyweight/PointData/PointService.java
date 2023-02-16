package com.madushan.Flyweight.PointData;

import java.util.ArrayList;
import java.util.List;

public class PointService {

    private PointIconFactory pointIconFactory;

    List<Point> points = new ArrayList<>();

    public PointService(PointIconFactory pointIconFactory) {
        this.pointIconFactory = pointIconFactory;
    }

    public void addPoint( int x, int y,PointType type){
        PointIcon pointIcon = pointIconFactory.getPointIcon(type);
        points.add(new Point(x, y, pointIcon));
    }

    public List<Point> getPoints() {
        return points;
    }

}
