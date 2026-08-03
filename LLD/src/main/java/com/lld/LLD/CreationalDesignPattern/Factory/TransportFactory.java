package com.lld.LLD.CreationalDesignPattern.Factory;

public class TransportFactory {
    public static Transport getTransport(String s){
        switch(s){
            case "Car":
                    return new Car();
            case "Bike":
                return new Bike();
            default:
               throw new IllegalArgumentException("Vehical not supported");
        }
    }
}
