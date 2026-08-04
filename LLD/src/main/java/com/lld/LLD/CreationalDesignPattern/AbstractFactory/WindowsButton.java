package com.lld.LLD.CreationalDesignPattern.AbstractFactory;

public class WindowsButton implements Button{
    @Override
    public void press() {
        System.out.println("Windows Button pressed");
    }
}
