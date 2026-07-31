package com.lld.LLD.CreationalDesignPattern.Singleton;

public class BillPlugSingleton {

    private static class Holder{
        private static  final BillPlugSingleton instance=new BillPlugSingleton();


    }

    public static BillPlugSingleton getInstance(){
        return Holder.instance;
    }
}
