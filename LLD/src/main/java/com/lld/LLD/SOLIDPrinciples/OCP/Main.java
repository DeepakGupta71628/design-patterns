package com.lld.LLD.SOLIDPrinciples.OCP;

public class Main {
    public static void main(String[] args) {
        PaymentMethod paymentMethod=new DebitCard();


        PaymentProcessor process= new PaymentProcessor( );
        process.processPayment(paymentMethod,100);



    }
}
