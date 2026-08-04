package com.lld.LLD.CreationalDesignPattern.AbstractFactory;

public class MacFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public ScrollBar createScroll() {
        return new MacScroll();
    }
}
