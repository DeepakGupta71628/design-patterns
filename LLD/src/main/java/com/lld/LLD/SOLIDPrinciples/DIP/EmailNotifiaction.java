package com.lld.LLD.SOLIDPrinciples.DIP;

public class EmailNotifiaction implements NotificationChannel{
    @Override
    public void send(String s) {
        System.out.println("Email"+s);
    }
}
