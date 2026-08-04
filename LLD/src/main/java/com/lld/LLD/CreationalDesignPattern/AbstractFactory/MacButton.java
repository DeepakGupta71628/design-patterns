package com.lld.LLD.CreationalDesignPattern.AbstractFactory;

public class MacButton implements Button{
    @Override
    public void press() {
        System.out.println("Mac OS Button pressed");
    }
}
