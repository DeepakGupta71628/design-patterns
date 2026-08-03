package com.lld.LLD.CreationalDesignPattern.Factory;

public class Car implements Transport{
    @Override
    public void deliver() {
        System.out.println("Car");
    }
}
