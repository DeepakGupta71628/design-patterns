package com.lld.LLD.SOLIDPrinciples.OCP;

public class DebitCard implements PaymentMethod{
    @Override
    public void payment(double amount) {
        System.out.println("DebitCard");
    }
}
