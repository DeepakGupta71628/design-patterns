package com.lld.LLD.SOLIDPrinciples.DIP;

public class NotificationService {
   // private NotificationChannel channel;

    public void sendNotification(NotificationChannel channel, String s){
        channel.send(s);
    }
}
