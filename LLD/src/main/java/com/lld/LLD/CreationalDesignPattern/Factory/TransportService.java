package com.lld.LLD.CreationalDesignPattern.Factory;

import com.sun.java.accessibility.util.Translator;

public class TransportService {

    Transport transport= TransportFactory.getTransport("Bike");
}
