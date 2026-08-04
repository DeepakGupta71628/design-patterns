package com.lld.LLD.CreationalDesignPattern.AbstractFactory;

public class AppUI {

    private Button button;
    private ScrollBar scrollBar;

    public AppUI(UIFactory factory){
        button=factory.createButton();
        scrollBar=factory.createScroll();

    }

    public void renderUI(){
        button.press();
        scrollBar.scroll();
    }
}
