package com.lld.LLD.CreationalDesignPattern.Factory;



public class Bike implements Transport {
    @Override
    public void deliver() {
        System.out.println("Bike");
    }
}
