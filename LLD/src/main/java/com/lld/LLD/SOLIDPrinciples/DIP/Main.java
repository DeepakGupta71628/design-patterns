package com.lld.LLD.SOLIDPrinciples.DIP;

public class Main {
    public static void main(String[] args) {
        NotificationService service=new NotificationService();
        service.sendNotification(new EmailNotifiaction(),"emial");
        service.sendNotification(new SmsNotification(),"sms");
    }
}
