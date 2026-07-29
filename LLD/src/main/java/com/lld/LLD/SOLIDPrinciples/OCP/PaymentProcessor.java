package com.lld.LLD.SOLIDPrinciples.OCP;

public class PaymentProcessor {
    public void processPayment(PaymentMethod paymentMethod,double amount){
        paymentMethod.payment(amount);
    }
}