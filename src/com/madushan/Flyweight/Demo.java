package com.madushan.Flyweight;

import com.madushan.Flyweight.PointData.PointIconFactory;
import com.madushan.Flyweight.PointData.PointService;
import com.madushan.Flyweight.PointData.PointType;

public class Demo {

    public static void main(String[] args) {

        var pointIconFactory = new PointIconFactory();
        var service = new PointService(pointIconFactory);
        service.addPoint(1, 2, PointType.CAFE);
        service.addPoint(3, 4, PointType.HOSPITAL);
        service.addPoint(4, 3, PointType.HOSPITAL);
        for (var point : service.getPoints()) {
            point.drawPoint();
        }


    }
}
