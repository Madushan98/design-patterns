package com.madushan.facade;

import com.madushan.facade.NotificationService.Message;
import com.madushan.facade.NotificationService.NotificationServer;

public class NotificationSender {

    public  void  send(String msg, String target){
        var server = new NotificationServer();
        var connection = server.connect("ip");
        var authToken = server.authenticate("appID","key");
        var message = new Message(msg);
        server.send(authToken, message, target);
    }

}
