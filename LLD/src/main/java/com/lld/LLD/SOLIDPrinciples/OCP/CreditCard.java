package com.lld.LLD.SOLIDPrinciples.OCP;

public class CreditCard implements PaymentMethod{
    @Override
    public void payment(double amount) {
        System.out.println("CreditCard");

    }
}
