package com.lld.LLD.CreationalDesignPattern.AbstractFactory;

public class WindowsScroll implements ScrollBar{
    @Override
    public void scroll() {
        System.out.print("Windows scrolled");
    }
}
