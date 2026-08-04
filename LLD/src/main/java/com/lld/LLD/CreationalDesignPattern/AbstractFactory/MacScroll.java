package com.lld.LLD.CreationalDesignPattern.AbstractFactory;

public class MacScroll implements ScrollBar{
    @Override
    public void scroll() {
        System.out.println("Mac Scrolled");
    }
}
