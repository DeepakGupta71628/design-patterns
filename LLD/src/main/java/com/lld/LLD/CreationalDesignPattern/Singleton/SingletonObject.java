package com.lld.LLD.CreationalDesignPattern.Singleton;

import javax.swing.text.GapContent;

public class SingletonObject {
    private int data;

    private static SingletonObject instance;

    private SingletonObject(int data) {
        this.data = data;
    }

    public synchronized static SingletonObject getInstance(int data){

        if(instance==null){
            synchronized (SingletonObject.class){
                if(instance!=null)
                    instance= new SingletonObject(data);
            }
        }
       return  instance;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}


//Singleton broke if we use Reflection

//Constructor<Singleton> c =
//        Singleton.class.getDeclaredConstructor();
//
//c.setAccessible(true);
//
//Singleton s2 = c.newInstance();


//Prevention is to return exception when private constructor is called to create object (only possible with Reflection)
//private Singleton() {
//
//    if(instance != null)
//        throw new RuntimeException();
//}


//-----------------------------------------------------
//Cloning Attack
//Singleton s2 = s1.clone();
//
//prevantion by throwing cloneException
//@Override
//protected Object clone()
//        throws CloneNotSupportedException {
//
//    throw new CloneNotSupportedException();
//}