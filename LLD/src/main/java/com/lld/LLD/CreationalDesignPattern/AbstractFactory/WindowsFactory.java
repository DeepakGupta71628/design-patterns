package com.lld.LLD.CreationalDesignPattern.AbstractFactory;

public class WindowsFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public ScrollBar createScroll() {
        return new WindowsScroll();
    }
}
