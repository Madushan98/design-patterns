package com.madushan.facade;

public class Demo {

    public static void main(String[] args) {

        var service = new NotificationSender();
        service.send("Hello World", "target");

    }

}
