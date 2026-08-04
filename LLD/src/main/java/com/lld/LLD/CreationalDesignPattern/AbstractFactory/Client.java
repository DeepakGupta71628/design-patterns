package com.lld.LLD.CreationalDesignPattern.AbstractFactory;

public class Client {
    public static void main(String[] args) {
        AppUI appUI=new AppUI(new MacFactory());
        appUI.renderUI();
    }
}
