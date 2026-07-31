package com.lld.LLD.SOLIDPrinciples.DIP;

public class SmsNotification implements NotificationChannel{
    @Override
    public void send(String s) {
        System.out.println("sms"+s);
    }
}
